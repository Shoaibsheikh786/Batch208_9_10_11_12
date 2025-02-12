package com.practice.practice1;

class A {
	int a = 10;

	public void getData(int a) {
		a = a;
		a=20;
		this.a=40;
		System.out.println(a);
	}

	public void printData() {
		this.a=330;
		System.out.println(a);
	}
}

public class Practice1 {

	public static void main(String[] args) {
		A obj1 = new A();
		System.out.println(obj1.a);                   //10
		obj1.getData(30);
		obj1.printData();                            // 30 , 10 , 20                      
	}

}
