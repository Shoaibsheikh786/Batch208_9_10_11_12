package com.arrays;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
     
		//sum of natural numbers, up-to n
		
		int n=100;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			//existing number + i(consultive number)
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
