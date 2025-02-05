package com.arrays;

public class Arrays2 {

	public static void main(String[] args) {
    

		
		int arr[]=new int[5];
		for(int i=0;i<5;i++)
		{
			
			System.out.print(arr[i]+" ");
			arr[i]=i*3;		
		}
		System.out.println();
		
	System.out.println("----------------");
	
		//repeating code
		//Loops --> for 
		for(int i=0;i<5;i++)
		{
		System.out.print(arr[i]+" ");
		}
	
	}

}
