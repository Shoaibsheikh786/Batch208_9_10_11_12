package com.jumpstatements;

public class SwitchP1 {

	public static void main(String[] args) {
    
		int val=1;
/*		if(val==1)
		{
			System.out.println("Sunday ");
		}
		else if(val==2)
		{
			System.out.println("Monday ");
		}
		else 
		{
			System.out.println("Wrong input");
		}
	*/
		switch(val)
		{
		case 1:
			System.out.println("Sunday ");
			break;
			
		case 2:
			System.out.println("Monday ");
			break;
			
		default:
			System.out.println("Wrong input");
		
		}
	
	}

}
