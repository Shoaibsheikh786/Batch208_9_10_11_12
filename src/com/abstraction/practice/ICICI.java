package com.abstraction.practice;



public class ICICI implements RBI {

	public void reg() {

	}
	public void Register()
	{
		System.out.println("register logic in icic");
	}

	public void withdraw() {
		System.out.println("ICICI LOGIC FOR WITH-DRAW MONEY");
	}

	public void deposit() {
		System.out.println("Deposit logic of ICICI");
	}

	public void upi() {
		System.out.println("upi logic icici bank");
	}

	public static void main(String[] args) {
		ICICI obj1=new ICICI();
		obj1.withdraw();
	}

}
