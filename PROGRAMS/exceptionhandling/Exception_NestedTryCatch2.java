package com.evergent.corejava.exceptionhandling;

import java.util.*;

public class Exception_NestedTryCatch2 {
	String name="null";
	int k=0;
	public void myData()
	{
		try {
			System.out.println("One");
			System.out.println(name.length());
			try {
			int t=10/k;
			System.out.println("end");
		}
		catch(ArithmeticException e) {
			System.out.println("I can handle:"+e);
		}
			finally {
				System.out.println("Finally block : inner try");
			}
			System.out.println("end");
	}
		catch(NullPointerException|ArithmeticException e) {
			System.out.println("I can handle"+e);
		}
		finally {
			System.out.println("Outer finally");
		}
	}
	public static void main(String args[]) {
		Exception_NestedTryCatch2 ed2=new Exception_NestedTryCatch2();
		ed2.myData();
	}

}
