package com.collections.list1;

import java.util.LinkedList;
import java.util.List;

public class List3 {

	public static void main(String[] args) {
    
		   List<Integer> i1=new LinkedList<Integer>();  
		   i1.add(0);
		   i1.add(10);
		   i1.add(1000);
		   i1.add(10);
		   i1.add(10);
		   i1.add(134);
		   
		   for(int i=0;i<i1.size();i++)
		   {
			    System.out.println(i1.get(i));
		   }
	}

}
