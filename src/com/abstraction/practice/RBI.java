package com.abstraction.practice;

public interface RBI  {
	// withdraw
	// deposit
	int a = 10;  
	public abstract void withdraw();
	public abstract void deposit();
	default void nfc() {
	
		System.out.println("non abstract method in interface");
	}

}