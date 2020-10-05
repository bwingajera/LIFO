package com.nokia.lifo;

import static org.junit.Assert.assertTrue;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.nokia.constants.Constants;
import com.nokia.dao.StackOperationDao;
import com.nokia.dao.StackRepository;
import com.nokia.model.Stack;
import com.nokia.service.StackService;

import org.springframework.http.HttpEntity;

@RunWith(SpringRunner.class)
@SpringBootTest(classes =LifoApplication.class)
class LifoApplicationTests {

	
	@Autowired
	private StackService stackService;

	TestRestTemplate restTemplate = new TestRestTemplate();

	HttpHeaders headers = new HttpHeaders();
	
		
	
	@Test
	public void push() {
	    Stack stack=stackService.push(4);
		assertTrue(stack.getValue()==4);
	}
	
	
    @Test 
    public void pop() {
    	ResponseEntity responseEntity = stackService.pop();
	    assertTrue(responseEntity.getBody().equals(Constants.MSG_STACK_DELETE)); 	   
    }
	 
	private String createURLWithPort(String uri) {
		return "http://localhost:8080/lifo/"+uri;
	}
	

	

}
