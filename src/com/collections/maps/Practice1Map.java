package com.collections.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice1Map {

	public static void main(String[] args) {
    
		// key value pair --> roll_no --> name 
		
	//	Map<key,value> m1=new HashMap<key,value>();
		
		Map<Integer,String> m1=new HashMap<>();
		m1.put(121, "java");
		m1.put(1213, "selenium");
		m1.put(1214, "selenium");
		m1.put(121, "c++");
	
		
	//	System.out.println(m1.get(1213))
     Set <Integer> s1= m1.keySet();
     
     List<Integer> i1=new ArrayList<>(s1);
     
     for(int i:i1)
     {
    	 System.out.println(m1.get(i));
     }
	}

}
