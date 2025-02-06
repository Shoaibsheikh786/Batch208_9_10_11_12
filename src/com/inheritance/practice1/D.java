package com.inheritance.practice1;
class A
{
	void fun1()
	{
		System.out.println("i am class A fun1");
	}
}
class B extends ClassA
{
	void fun2()
	{
		System.out.println("i am class B fun2");
	}
}
class C  extends B
{
	void fun3()
	{
		System.out.println("i am class C fun3");
	}
}
public class D extends C{
	
	void fun5()
	{
		System.out.println("Fun5 in D");
	}
	public static void main(String[] args) {
		
		D obj=new D();
	    C obj2=new C();
	    obj.fun3();
		obj.fun2();
		obj.fun1();
		obj2.fun3();
		
	}

}


