package com.inhertance.practice2;

class S
{
	int id=10;

}

class T extends S
{  
	int id=30;
	public void printid()
	{  
		int id=40;
		System.out.println(id+this.id+super.id);
		//id --> Local one , instance id, super id
	}
}
public class ThisAndSuperKeword {

	public static void main(String[] args) {
     T obj1=new T();
    //   obj1.printid();
         
       
       
	}

}
