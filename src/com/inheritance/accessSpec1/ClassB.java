package com.inheritance.accessSpec1;

public class ClassB extends ClassA {
	
	void printDataWithInheritance()
	{
		System.out.println(pub);
		System.out.println(def);
		System.out.println(pro);
		System.out.println(pri);
	}

	// 2 -> extends that class , create the object
	
	public static void main(String[] args) {
	      ClassA obj1=new ClassA();
	      obj1.pub=30;
	      obj1.def=40;
	      obj1.pro=50;
	  //  obj1.pri=200;
	  //   obj1.prinPrivateData();
	      
	 // extend , create the object
		}


}
