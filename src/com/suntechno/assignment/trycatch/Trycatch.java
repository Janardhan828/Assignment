package com.suntechno.assignment.trycatch;

public class Trycatch {

	public static void main(String[] args) {
	
		try {
			
			int[] values = {1,2,3}; 
			
			System.out.println(values[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
		
			System.out.println("try catch block");
			
		}
		
		

	}

}
