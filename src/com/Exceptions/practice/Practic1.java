package com.Exceptions.practice;

import java.io.FileInputStream;

public class Practic1 {

	public void div(int a, int b) {
		
		System.out.println("Selenium");
		try
		{  
			
			System.out.println(a / b); 
					
		}
		catch(ArithmeticException e)
		{
			System.out.println("There is exception ");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("close the connectin with database");
		}
		
		
		
			
	}

	public static void main(String[] args) {
		Practic1 o1=new Practic1();
//		o1.div(10, 0);
//	//	FileInputStream fis=new FileInputStream("myfile.logs");
		
		int arr[]= {1,54,32,11,53};
		try
		{
			System.out.println(arr[4]);
			System.out.println(5/0);
		}
		catch( ArithmeticException e)
		{
		  
			System.out.println("ArithmeticExption generated");
		}
		catch( ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array exception ");
		}

    System.out.println("hello world ");
	     
		
		
		
	}
}
