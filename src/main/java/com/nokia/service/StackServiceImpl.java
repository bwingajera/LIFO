package com.nokia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.nokia.constants.Constants;
import com.nokia.dao.StackRepository;
import com.nokia.model.Stack;

@org.springframework.stereotype.Service(value = "stackService")
public class StackServiceImpl implements StackService{

	@Autowired(required=true)
	private StackRepository stackRepository;
	
	@Override
	public Stack push(int value) {
		Stack stack=new Stack();
		stack.setValue(value);
		return stackRepository.save(stack);
	}

	@Override
	public ResponseEntity<?> pop() {
		int count =stackRepository.findAll().stream().map(i -> i.getId()).max(Integer::compareTo).get();
		if(count==0) {
			return ResponseEntity.ok(Constants.MSG_STACK_UNDERFLOW);
		}else {
			stackRepository.deleteById(count);	
			return  ResponseEntity.ok(Constants.MSG_STACK_DELETE);
		}
	}

	@Override
	public Long size() {
		return stackRepository.count();
	}

	@Override
	public Object[] getFullStack() {
		return stackRepository.findAll().stream().map(i -> i.getValue()).toArray();
	}


}
