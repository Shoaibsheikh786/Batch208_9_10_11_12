package com.inheritance.practice1;
class ClassB
{
	void method1()
	{
		System.out.println("Hello Method 1");
	}
	void method2()
	{
		System.out.println("Hello Method 2 ");
	}
}
public class ClassA extends ClassB{

	void method3()
	{
		System.out.println("Hello Method  3");
	}
	void method4()
	{
		System.out.println("Hello Method 4");
	}
	public static void main(String[] args) {
		ClassA obj1=new ClassA();      //valid
		ClassB obj2=new ClassA();      //valid
		
		ClassB ob3=new ClassB();
		
		obj1.method3(); 
		obj1.method2();
		///-------------------------------------
	
		obj2.method2();
	//	obj2.method3();
		
//		String str=new String("hello");
//		String str2=new String("hello");
//		System.out.println(str==str2);
		
		
	}

}
