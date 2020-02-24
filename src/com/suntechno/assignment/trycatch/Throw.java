package com.suntechno.assignment.trycatch;

public class Throw {
	
	 static void validate(int age){
		 
	     if(age<18)
	      throw new ArithmeticException("Age is not valid");
	     else
	      System.out.println("welcome to vote");
	   }
	 
	public static void main(String[] args) {
		validate(15);

	}

}
