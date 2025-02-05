package com.string.Basic1;

public class StringPool {

	public static void main(String[] args) {
		String s1="jhon";
		String s2="jhon";
		String s3=new  String("jack");
		String s4=new String("jack");
		
	//	System.out.println(s1==s3);
		
		System.out.println(s3==s4);

		System.out.println(s3.equals(s4));
	}
}
