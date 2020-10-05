package com.nokia.dao;

import org.springframework.stereotype.Repository;


@Repository
public interface StackOperationDao {
  
	public String popOperation();
	public String pushOperation(int x);
	public int getStackSize();
}
