package com.evergent.corejava.lambdaexpression;
interface Person1 {
	abstract public void eat();
}

//Anonymous Inner class
public class Lambda1Prog {
	public static void main(String[] args) {
		Person1 p1 = new Person1() {

			public void eat() {
				System.out.println("Eat..");
			}
		};
		p1.eat();
	}

}