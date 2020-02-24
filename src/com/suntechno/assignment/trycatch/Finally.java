package com.suntechno.assignment.trycatch;

public class Finally {

	public static void main(String[] args) {
		try {
			int num = 50/0;
			System.out.println(num);
			
		} 
			  catch (ArithmeticException e) { System.out.println("ArithematicException");
			  
			  }
			 
		finally {
			System.out.println("Finally is excuted");
		}

	}

}
