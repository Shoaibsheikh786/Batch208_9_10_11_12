package com.inheritance.practice1;



public class ScentificCal extends GrandFather{
	// S.Calculator 5 -- > 4 , 1
	// Calculator 4
	
	void power(int n,int p)
	{
		System.out.println(Math.pow(n, p));
	}

	
	public static void main(String[] args) {
		
		ScentificCal c1=new ScentificCal();
		//GrandFather c2=new GrandFather();
		c1.add(5,10);
	    c1.oldMethod();
        c1.power(3,4);
		
		
	
	
		
            
		
		
		
	}
	

}
