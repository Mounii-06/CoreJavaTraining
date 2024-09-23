package com.evergent.corejava.exceptionhandling;

public class Exception19_multi_catch {
	String name="null";
	int k=0;
	public void myData()
	{
		try {
			System.out.println("One");
			System.out.println(name.length());
			int t=10/k;
			System.out.println("end");
		}
		catch(NullPointerException|ArithmeticException e) {
			System.out.println("I can handle:"+e);
		}
	}
	public static void main(String args[]) {
		Exception19_multi_catch ed2=new Exception19_multi_catch();
		ed2.myData();
	}

}
