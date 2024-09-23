package com.evergent.corejava.exceptionhandling;
import java.util.*;

class EmployeeIdNotFoundException extends Exception{
	public  EmployeeIdNotFoundException(String message) {
		super(message);
	}
}
public class UserDefinedExceptionmy {
	public static void checkId(String id)throws EmployeeIdNotFoundException {
		if(id!="ETPL690") {
			throw new EmployeeIdNotFoundException("Id must be 693");
		}
		else {
			System.out.println("EmployeeId not found exception");
		}
	}
		
	public static void main(String args[]) {
		try {
			checkId("ETPL693");
		}
		catch(EmployeeIdNotFoundException e) {
			System.out.println("Caught the exception"+e.getMessage());
			System.err.println(e);
		}
		System.out.println("Program continue after handling exception");	
	}
}



