package com.nokia.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nokia.model.Stack;

@Repository
public interface StackRepository extends JpaRepository<Stack, Integer>  {
  
}
