package com.practice2.methodsagain;

public class MethodPractice {

	void printMyname()
	{
		System.out.println("Jhon");
	}
   
	//2. create a method which takes integer as an argument and prints  it
	void printMyid(int id)
	{
		System.out.println(id);
	}
	
	//3. method which takes two interges, print the values
	void sumTwoNumber(int a,int b)
	{
		// a --> value of a 
		// b --> value of b
		
//		System.out.println(a);
//		System.out.println(b);
		
		System.out.println(a+b);
	
	}
	
	//4. methods which subtracts two float number
static	void subTwonumber(float a,float b)
	{
		System.out.println(a-b);
	}

// 5. method which adds , -> int float and double

   void addThreeNumber(int a,float b,double c)
   {
	   System.out.print(a+b+c);
   }


	public static void main(String[] args) {
		System.out.println("hello world");
		MethodPractice obj=new MethodPractice();
		obj.printMyname();
		obj.printMyname();	
	    obj.printMyid(20);
	    obj. sumTwoNumber(10,7);
	    MethodPractice.subTwonumber(10.5f, 9.5f);
	  obj.addThreeNumber(5,6.5f,5.8d);   
	   
		
	}
	
	

}
