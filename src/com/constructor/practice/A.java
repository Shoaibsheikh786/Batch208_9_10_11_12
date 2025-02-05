package com.constructor.practice;

public class A {
	
	//constructor 
	//it does not have return type
	 //name should be same as class name
	
	//it will automatically be invoked
	A()
	{
		System.out.println("hello world i am CONSTRUCTOR");
	}
	//we need to call this if we want to execute it
	void fun1()
	{
		System.out.println("hell world i am methods ");
	}

	public static void main(String[] args) 
	{
      A obj1=new A();
      A obj2=new A();
	}

}
