package com.abstraction.practice;

public class PNB implements RBI {

	@Override
	public void withdraw() {
		System.out.println("Autentication , otp --> sanner ");
		System.out.println("PNB LOGIC FOR WITH-DRAW MONEY");
	}

	@Override
	public void deposit() {
		System.out.println("Autentication , otp --> sanner ");
		System.out.println("PNB LOGIC FOR DEPOAsit MONEY");
	}
	
	public static void main(String[] args) {
		PNB obj1=new PNB();
		obj1.withdraw();
	}
	


}
