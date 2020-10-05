package com.nokia.utility;
 
/**
 * @author sterlite
 *
 */
/**
 * @author sterlite
 *
 */
public class Stack {

	
	private static final Stack STACK= new Stack();
	static final int MAX = 1000; 
    int top; 
    int stackValues[] = new int[MAX];	
	
	public static Stack getStack() {
		return STACK;
	}
  
    public boolean isEmpty() 
    { 
        return (top < 0); 
    } 
    
    private Stack() 
    { 
        top = -1; 
    }
    
  
    public boolean push(int x) 
    { 
        if (top >= (MAX - 1)) { 
            return false; 
        } 
        else { 
        	stackValues[++top] = x; 
            return true; 
        } 
    } 
  
    public int pop() 
    { 
        if (top < 0)  
            return 0; 
        else 
            return  stackValues[top--]; 
        
    } 
  
    
    public int size() {
    	System.out.println(top);
    	return top;
    }
    
}
