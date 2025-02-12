package com.java.finalKeywrods;

class A {
	final int si = 2;
	int a;

	public void brake() {
		a = 5;
		System.out.println("hello world");
	}

	final public void shiftGear() {
		System.out.println("shift Gear");
	}

	public void shiftGear(int a) {
		System.out.println("helllo " + a);
	}

}

public class FinalWithMethods extends A {

	// over-ride
	public void shiftGear() {
		System.out.println("This is another logic");
	}

	public static void main(String[] args) {
		String s;

	}

}
