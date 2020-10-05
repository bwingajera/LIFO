package com.nokia.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nokia.dao.StackOperationDao;
import com.nokia.dao.StackRepository;
import com.nokia.utility.Stack;

@Repository(value="StackOperationDao")
public class StackOperationDaoImpl implements StackOperationDao {

	@Autowired
	private StackRepository stackRepository;
	
	@Override
	public String popOperation() {
		if(Stack.getStack().pop()!=0) { return "successfully remove"; }else { return "Stack Underflow";}
	}

	@Override
	public String pushOperation(int x) {
			
		if(Stack.getStack().push(x)){
			return x + " pushed into stack";
		}else {
			return "Stack Underflow"; 
		}
	}

	@Override
	public int getStackSize() {
		return Stack.getStack().size();
	}

}
