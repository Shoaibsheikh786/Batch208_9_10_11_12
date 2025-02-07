package com.inhertance.practice2;

class A
{
	int id;
	void printMyname(String name)
	{
		System.out.println(name);
	}
}

class B 
{
	int id;                         // 0
	String course;                 //  null
	void printMycourse(String course,int id)  //l.v.course=null;  10
	{   
	    this.id=this.id;                     //this.id --> 0
	    course=this.course;
		System.out.println(course +" "+ this.id);
	}
	void printValueofId()
	{  
		System.out.println(this.id);
		System.out.println(course);
	}	
}
public class Inhetiance2 {
	public static void main(String[] args) {
		B obj1=new B();
		obj1.printValueofId();               // 0 null
		obj1.printMycourse("Testing", 10);   // null 0
		obj1.printValueofId();               // 0 null
	
     
	}

}
