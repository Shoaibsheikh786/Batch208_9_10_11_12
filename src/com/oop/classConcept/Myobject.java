package com.oop.classConcept;

public class Myobject {
	
	
	public static void main(String[] args){
		
		//data of student
		
		Student s1=new Student();
		s1.roll_no=20;
		s1.ch='a';
		s1.dist=2.5f;
		System.out.println(s1.roll_no);  //
		System.out.println(s1.ch);
		System.out.println(s1.dist);
		
		Student s2=new Student();
		s2.roll_no=12;
		s2.ch='b';
		s2.dist=3.5f;
		System.out.println(s2.roll_no);  //
		System.out.println(s2.ch);
		System.out.println(s2.dist);
		
		System.out.println("------------------------------------------");
		//3rd student 
		Student s3=new Student();
		s3.roll_no=90;
		s3.ch='c';
		s3.dist=3.6f;
		System.out.println(s3.roll_no);	 //90
		System.out.println(s3.ch);      //b
		System.out.println(s3.dist);   //3.6_
		
	//_--------------------------------------------------------------------------------
		
		Student.d=5;
		
	}

}
