package com.abstraction.practice;

class Ab
{
	int a;
}
public class GC {

	public static void main(String[] args) {
	
		Ab obj1=new Ab();
		obj1.a=20;
		
		obj1=new Ab();
		
		System.out.println(obj1.a);   

	}

}
