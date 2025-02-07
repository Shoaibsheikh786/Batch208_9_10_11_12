package com.Exceptions.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Excption2 {
	
	void fun1() throws FileNotFoundException
	{
		
		System.out.println("hello world ");
	   FileInputStream fis=new FileInputStream("myfile.xls");	
     	System.out.println("hello java");
	}

	public static void main(String[] args)   {
		
	
	
		
	}

}
