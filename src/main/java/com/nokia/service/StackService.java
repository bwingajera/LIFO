package com.nokia.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nokia.model.Stack;

public interface StackService {

	public Stack push(int value);
	
	public ResponseEntity<?> pop();
	 
	public Long size();
	
	public Object[] getFullStack();
	
}
