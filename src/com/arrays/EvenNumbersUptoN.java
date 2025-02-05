package com.arrays;

public class EvenNumbersUptoN {

	public static void main(String[] args) {
         
		int n=0;;
		for (int i = 1; i <= 100; i++)
		{ 
		   n=i;           //updating value 
		   if (n % 2 == 0)
			{
				System.out.println("Even " + n);
			}
		}
	}

}
