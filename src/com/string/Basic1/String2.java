package com.string.Basic1;

public class String2 {
	
	public static void main(String[] args) {
		
//		String s=new String("Hello");
//		System.out.println(s);
//		
		// 
		String s2="12";
		String s3="12";
		System.out.println(s2+s3);
		
		//string pool 
	    System.out.println(s2.equals("12"));
	    
	    
	    //plaindrome of string 
	    String s="madm"; //n--> 3,2,1,0
	    String or=s;
	    String rev="";
	    
	    for(int i=s.length()-1;i>=0;i--)
	    {
	     char ch= s.charAt(i);
	     rev=rev+ch;
	    }
	    if(or.equals(rev))
	    {
	    	System.out.println("plaindrome");
	    }
	    else
	    {
	    	System.out.println("not plaindrome");
	    }
	    
	    

	    
	    
	    
	}

}
