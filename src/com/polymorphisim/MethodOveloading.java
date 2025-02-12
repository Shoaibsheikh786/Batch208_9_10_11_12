package com.polymorphisim;

public class MethodOveloading {
	
   // create one methods which adds two numbers 
	int num1;
	int num2;
	int num3;
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(float a,float b)
	{
		System.out.println(a+b);
	}
	public int add(String a,String b)
	{
		int c=4*3;
		float f=2.4f;
		System.out.println(f+a+c);   // 2.41212
		return 4+3;               //value and control

	}
	
	
	public static void main(String[] args) {
		MethodOveloading o1=new MethodOveloading();
//		o1.add(12.4f, 29.5f);
//		o1.add(12, 15);
		System.out.println(o1.add("12","10"));  //
	
	}
  

}
