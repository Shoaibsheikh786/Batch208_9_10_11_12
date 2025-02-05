package com.constructor.practice;

public class B {

	void fun1()
	{ 
		System.out.println("this is function 1");
	}

	B(String s)
	{
		System.out.println("this is constructor "+s);
	}
	B()
	{
		System.out.println("hello world");
	}
   
    

	public static void main(String[] args) {
      
	   B obj1=new B();	
	}

}
