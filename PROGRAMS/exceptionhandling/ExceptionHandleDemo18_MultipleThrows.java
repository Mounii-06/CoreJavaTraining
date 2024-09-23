package com.evergent.corejava.exceptionhandling;

public class ExceptionHandleDemo18_MultipleThrows {
	String name="null";
	int k=0;
	public void myData() throws NullPointerException,ArithmeticException{
		System.out.println("one");
		System.out.println(name.length());
		int t=10/k;
		System.out.println(t);
		System.out.println("end");
		}
	public static void main(String args[]) {
		try {
		ExceptionHandleDemo18_MultipleThrows ed2=new ExceptionHandleDemo18_MultipleThrows();
		ed2.myData();
	}
		catch(Exception e) {
			System.out.println("i acn handle"+e);
		}

	}
}
