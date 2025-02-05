package com.class2.methods;

/*
 * 3. create an employee class with members
   --> age ,, id , char , salary 
   --> get the data from main method
   --print the data in the main methods */

public class Employee {
	int age;
	int id;
	char ch;
	float salary;
	int num1,num2;
	//take data store in age
	void getAge(int a)
	{
		age=a;
	}
	void printAge()
	{
		System.out.println(age);
	}
	
	void div()
	{  
		if(num2==0)
		{
			System.out.println("Division is not possible becuse den is 0");
		}
		else
		{
			System.out.println(num1/num2);
		}
		
	}
	
	void getDivData(int a, int b)
	{  
			num1=a;
         	num2=b;	
	}

	public static void main(String[] args) {
     //we create object of a class
		Employee e1=new Employee();
		
//		e1.num1=10;
//		//if we pass 0 it will not work , crashed 
//		e1.num2=0;
		e1.getDivData(10, 0);
		e1.div();
		
	}

}
