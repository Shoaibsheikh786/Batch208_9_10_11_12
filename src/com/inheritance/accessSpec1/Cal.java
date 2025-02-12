package com.inheritance.accessSpec1;

public class Cal {

	private int num1, num2;
	public int res;
	protected int pro;
	int def;

	public void div(int a, int b) {
		if (b == 0) {
			System.out.println("Division is not possible");
		} else {
			num1 = a;
			num2 = b;
			System.out.println(num1 / num2);
		}
	}

	private int prMethod() {
		System.out.println("This is private ");
		
		return 10;
		
	}
	
	int  sum(int a,int b)
	{
		int c=a+b;
		return c;
	}

	public Cal() {
		System.out.println("This is construcot");
	}
	
	public static void main(String[] args) {
		Cal obj=new Cal();
		obj.num1=12;
		obj.prMethod();
		
	}
}
