package com.abstraction.practice;


abstract class Basic
{
	public abstract void reg();
	
}
abstract class car  extends Basic
{  
	int a=10;
	public abstract void brake();
	public abstract void clutch();
	
	public void accel()
	{  int a; 
		a=12;
		System.out.println("this is normal method of accelerator in class Car");
	}
	public void shiftGear()
	{
		System.out.println();
	}
	car()
	{
		System.out.println("hello world");
	}
	


	
}

public class C1 extends car{

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clutch() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		C1 c1=new C1();
		   c1=new C1();
	   
		
	}

	@Override
	public void reg() {
		// TODO Auto-generated method stub
	
		
	}
	
	
	
	

}
