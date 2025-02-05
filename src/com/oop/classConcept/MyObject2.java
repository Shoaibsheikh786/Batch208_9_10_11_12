package com.oop.classConcept;

public class MyObject2 {

	public static void main(String[] args) {
    
		Student s1=new Student();
		s1.roll_no=20;
		s1.ch='a';
		s1.dist=2.5f;
		//d 
		//Student.d=5;
		s1.d=5;
		
		Student s3=new Student();
		s3.roll_no=90;
		s3.ch='c';
		s3.dist=3.6f;
		
		s3.d=10;
		
		
		System.out.println(s1.d);  // 5  5  10 
		
		System.out.println(s3.d);  // 5  10 10
		
	}

}
