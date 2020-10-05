package com.nokia.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.nokia.constants.Constants;
import com.nokia.dao.StackOperationDao;
import com.nokia.model.Stack;
import com.nokia.service.StackService;

@RestController
@RequestMapping()
public class StackController {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private StackOperationDao stackOperationDao;

	@Autowired
	private StackService stackService;	
	
    @GetMapping(Constants.STACK_SIZE1)
	public int getStackSize1() {
		return stackOperationDao.getStackSize();
	}

    
	@DeleteMapping(Constants.STACK_POP1)
	public String popOperation1() {	
		return stackOperationDao.popOperation();
	}
	
	@PatchMapping(Constants.STACK_PUSH1)
	public String pushOperation(@RequestParam("value") int value) {
		return stackOperationDao.pushOperation(value);
	}
	
	@PatchMapping(Constants.STACK_PUSH)
	public Stack pushOperation1(@RequestParam("value") int value) {
		LOGGER.info("Stack push operation start.");
		return stackService.push(value);
	}
		
	@DeleteMapping(Constants.STACK_POP)
	public ResponseEntity<?> popOperation() {
		LOGGER.info("Stack pop operation start.");
		return stackService.pop();
	}
	 
	@GetMapping(Constants.STACK_SIZE)
	public Long getStackSize() {
		LOGGER.info("get stack size.");
		return stackService.size();
	}
	
	@PostMapping(Constants.STACK_ELEMENTS)
	public Object[] initlizationStack() {
		LOGGER.info("get stack elements.");
		return stackService.getFullStack();
	}
	
	@GetMapping(Constants.PING_REQUEEST)
	public ResponseEntity<String> pingRequest() {
		return ResponseEntity.ok(Constants.PING_SUCCESSFUL); 
    }

}
