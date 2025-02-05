package com.oop.classConcept;

public class Practice1 {
 
	/*
	 * 1. create an employee class 
   store data -> int , char float bolean doubel long 
   and also store some static data 
   and print it 
	 * */
	public static void main(String[] args) {
     
		Employe e1=new Employe();
		Employe e2=new Employe();
		
		e1.age=25;
		e1.salary=23000f;
		
		e2.age=14;
		e2.salary=30000f;
		
		//static members
		Employe.inc=10;
		
		System.out.println(e1.age);
		System.out.println(e1.salary);
		System.out.println(e2.age);
		System.out.println(e2.salary);
		System.out.println(Employe.inc);
		
		
	}

}
