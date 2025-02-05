package com.practice2.methodsagain;

public class Method2returnValue {
  
	
	// create a methods which take a value int , print the value : value * 10 ;
	int printwith(int value)
	{  
		//stroe in some variable ans 
		int ans=value*10;
		return  ans;	
	}
	
	//create one methods which return the divsion of two number 
	
	char divisiontwonumber(int a,int b)
	{
		int div=a/b;    //5 
		float z=30.5f; //z 30.5f
		float y= 33.9f; //y=33.9f
		char ch='a';
		return ch;      //
	}
	
	
	public static void main(String[] args) {
		Method2returnValue obj=new Method2returnValue();
		// i want to access the ans variable which in inside the method (or it can be instance var);
		
      System.out.println(obj.divisiontwonumber(10, 2));;
   
     
     
     
     
	
	
		
		

	}

}
