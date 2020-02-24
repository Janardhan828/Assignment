package com.suntechno.assignment.trycatch;

class ThrowsException{
	void method()throws ArithmeticException {
		throw new ArithmeticException("ArithematicException Occured");
	}
}
public class Throws {

	public static void main(String[] args)throws ArithmeticException {
		ThrowsException te =new ThrowsException();
		te.method();
		
	}

}
