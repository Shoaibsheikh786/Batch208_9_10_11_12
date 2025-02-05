package com.class2.methods;

public class ReverseAnumber {
	
	public static void main(String[] args) {
		
		//12345
		//logic which will reverse the number
		int num=123454321;
		int ori=num;
		int rev=0;
		int r=0;
		
		while(num>0) 
		{
		  r= num%10;     //last digit 1
		  rev=rev*10+r;  //rev 0,3,32,321
		  num=num/10;   //remove the last digit 
		  
		}
		if(ori==rev)
		{
			System.out.println("plaindrome");
		}
		else
		{
			System.out.println("not plaindrome");
		}
	}

}
