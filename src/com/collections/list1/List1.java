package com.collections.list1;

interface i1 {
	void fun1();
}

public class List1 implements i1 {

	public void fun1() {
		System.out.println("This is fun1");
	}

	public void fun2() {
		System.out.println("This is fun2");
	}
	
	public static void main(String[] args) {
		
		 List1 l1=new  List1();
		 
		 i1 obj1=new List1();
		 
		 obj1.fun1();
		// obj1.fun2();

	
	}

}
