package com.class2.methods;

class Cal
{
	
	static int a=12;
	int b;
	
	//returnType methodName(i);
     void  add(int num1,int num2)
     {   

    	 int c=num1+num2;
    	 System.out.println(a);
     }
     
     int multi(int num1,int num2)
     {
    	 int c=num1*num2;
    	 return c;
    	 
     } 
     
     //return float , float two values
     float div(float a,float b)
     {
    	 float c =a/b;
    	 return c;
     }
     
     /**
      * returnType methodname(datatype var1,datatype var2,datatype var3)
      * {
      *   //logic for multiplication and store it in double var4
      *    return the double value which contains the multiplication of three numbers
      * }*/
     
     //representation 
     double multithreenumber(int a, float b,double c)
     {
    	double d=a*b*c;
    	return d;  // return value, control
    	
    	
    	//it will not work ,, unreachable code 
    //   System.out.println("hello");
       
     }
       
}
public class Calculator {
	
	
	
	public static void main(String[] args) {
		
	 //1. create an object 
		Cal c1=new Cal();
		c1.add(12,24);
	
		
	}

}
