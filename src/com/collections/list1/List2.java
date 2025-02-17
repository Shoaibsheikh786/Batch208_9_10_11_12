package com.collections.list1;

import java.util.ArrayList;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// arr[10000] => 100000
		
	// List<DataType> li=new ArrayList<DataType>();
		
	   int arr[]=new int[100];
	   //by index   10
	    arr[0]=10;
	    System.out.println(arr[0]);
	    
	 System.out.println("---------------------------------------------------------------");
	   
	   List<Integer> i1=new ArrayList<Integer>();  
	   i1.add(0);
	   i1.add(10);
	   i1.add(1000);
	   i1.add(10);
	   i1.add(10);
	   i1.add(134);
	   
	//   System.out.println("Size "+i1.size());
	   
	  // System.out.println(i1.contains(1430));
	   
//	   for(int i=0;i<3;i++)
//	   {
//		    System.out.println(i1.get(i));
//	   }
	   System.out.println("--------------------for each -----------------------");
	   //for each  //no inti no- condition , no ind
	   for(int i:i1)
	   {
		   System.out.println(i);
	   }
	   
//	   List<String> s1=new ArrayList<String>();
//	   s1.add("hello world");
//	   s1.add("java");
//	   s1.add("hello world");
//	   
//	   for(String s:s1)
//	   {
//		   System.out.println(s);
//	   }
	   
	   //char float 
	  
	  // Integer , Character  boolean 
	   
	   List<Object> o1=new ArrayList<>();
	   o1.add("string values");
	   o1.add(true);
	   o1.add(2.4f);
	   o1.add('a');
	  
	   
	   

	}

}
