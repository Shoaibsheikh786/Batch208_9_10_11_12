package com.collections.set1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set1 {
	
  public static void main(String[] args) {
	  
	 Set<Integer> s1=new HashSet<>();
	 
	 s1.add(10);
	 s1.add(100);
	 s1.add(10);
	 s1.add(1000);
	 s1.add(123);
	 s1.add(100); 
//	 Iterator <Integer> i1= s1.iterator();
//	 
//	 while(i1.hasNext())
//	 {
//		 System.out.println(i1.next());
//	 }
	 
	 //convert the set into List
	
	 List<Integer> obj1= new ArrayList<>(s1);
//	 System.out.println(obj1.get(0));
	 
	 for(int i=0;i<obj1.size();i++)
	 {
		 System.out.println(obj1.get(i));
	 }
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	//System.out.println(s1.get(0) );
	 
//    List<Integer> i1=new ArrayList<>(s1);
//    
//    for(int i=0;i<i1.size();i++)
//    {
//    	 System.out.println(i1.get(i));	
//    }
	 
	 
   
	 
	 
	
}
}
