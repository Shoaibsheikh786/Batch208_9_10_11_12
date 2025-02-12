package com.inheritance.accessSpec1;

public class ClassA {
	
	public    int pub=10;
	private   int pri=20;
	protected int pro=30;
              int def=40;
              
    void printData()
    {
    	System.out.println(pub);
    	System.out.println(pri);
    	System.out.println(pro);
    	System.out.println(def);
    }
    private void prinPrivateData()
    {
    	System.out.println("hello");
    }
    void printData2()
    {
    	System.out.println("hello this is method 2");
    }
	
	public static void main(String[] args) {
		ClassA obj=new ClassA();
	//	obj.printData();
		obj.pub=100;
		obj.pri=200;
		obj.pro=300;
		obj.def=400;
		
//--------------------------------------
		obj.prinPrivateData();
		
		
	}

}
