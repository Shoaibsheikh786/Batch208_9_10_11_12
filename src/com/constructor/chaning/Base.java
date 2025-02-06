package com.constructor.chaning;
class Setup
{
	Setup(int a)
	{
		System.out.println("This is setup");
	}
	Setup()
	{
		
	}
	void f1()
	{
		System.out.println("f1");
	}
}
public class Base extends Setup {
	
	Base()
	{  
		super();
		System.out.println("This is base");
		
	}
	void f2()
	{
		System.out.println("f2");
	}
	
	public static void main(String[] args) {
		
		Base obj2=new Base();
	}

}
