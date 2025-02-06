package com.inheritance.practice1;

public class Calculator {
	
	// addition sub mul div 
	int a,b;
	int res;
	void add(int num1,int num2)
	{  
		a=num1;
		b=num2;
		res=a+b;
		System.out.println("Additon of numbers "+res);
	}
	void sub(int num1,int num2)
	{
		a=num1;
		b=num2;
		res=a-b;
		System.out.println("Sub of numbers "+res);
	}
	void multi(int num1,int num2)
	{
		a=num1;
		b=num2;
		res=a*b;
		System.out.println("Multi of numbers "+res);
	}
	void div(int num1,int num2)
	{
		a=num1;
		b=num2;
		res=a/b;
		System.out.println("div of numbers "+res);
	}
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		obj.add(10, 12);
	}

}
