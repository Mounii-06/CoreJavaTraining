package com.evergent.corejava.lambdaexpression;


@FunctionalInterface
interface Person2 {
	abstract public void eat();
}

//It internally calls the method food 
public class Lambda2Prog {

	public static void main(String[] args) {
		Person2 p2 = () -> {
			{
				System.out.println("Rich Food...");
			}
		};
		p2.eat();
	}
}