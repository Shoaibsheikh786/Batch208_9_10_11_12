package com.practice.practice1;

public class StringsP {

	public static void main(String[] args) {
        
		String s1="hello world i am learning java";
		String []arr=  s1.split(" ");
		
		for(int j=arr.length-1;j>=0;j--)
		{
			String temp=arr[j];
			
			for(int i=temp.length()-1;i>=0;i--)
			{
				char ch=temp.charAt(i);
				 System.out.print(ch);   
			}
			
			System.out.println("  "+temp.length());
		}
	System.out.println("------------------------------------------");	
	
		
	
		
		
		
	}

}
