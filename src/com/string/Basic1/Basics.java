package com.string.Basic1;

public class Basics {
	
	public static void main(String[] args) {
		
		String s="jHon";
		String s2="9349238";

	   // first character of string s
//			  char ch= s.charAt(0);
//			   System.out.print(ch);
		
		int l=s.length();
		System.out.println(l);
		
		boolean b=s.equals(s2);
		System.out.println(b);
		
		boolean b2=s.equalsIgnoreCase(s2);
		System.out.println(b2);
		
		System.out.println(s.equalsIgnoreCase(s2));
		
		System.out.println(s.toUpperCase());
		System.out.println(s2.toUpperCase());
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.substring(1));
		
		String str="i am leaning string ";
		System.out.println(str.substring(2, 7));
		
		
		System.out.println(str+" THIS IS ADDTION INFO");
		
		String str1="hello world i am leaning jagva ";
		
		System.out.println(str1.contains("am i"));
		
		System.out.println(str1.indexOf('g'));
		
		System.out.println(str1.lastIndexOf('g'));
		
		System.out.println(str1.startsWith("helo"));
		System.out.println(str1.endsWith("world i am leaning jagva "));
		
		
		String s6="";;  //null
//		System.out.println(str1.isEmpty());
//		System.out.println(str1.isBlank());
	   
		System.out.println(s6.isBlank());
		
		String s7="hello world i am learning selenium";
	//	System.out.println(s7.replace("selenium", "java"));
		
		String arr[]=    s7.split(" ");
		System.out.println(arr[1]);
		
		
		
		
		
		
	 
	   

	}

}
