package com.inheritance.accessSpec2;

import com.inheritance.accessSpec1.Cal;

public class Calculator extends Cal {
	
	void printData12()
	{
		System.out.println(res);
	//	System.out.println(num1);
		System.out.println(def);
		System.out.println(pro);
	}
	

	public static void main(String[] args) {
   
	  Cal ob1=new Cal();
	  ob1.res=10;
//	  ob1.pro=10;
//	  ob1.def=20;
	  
		
	}

}
