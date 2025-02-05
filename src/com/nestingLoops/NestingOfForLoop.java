package com.nestingLoops;

public class NestingOfForLoop {

	public static void main(String[] args) {

		/*
		 * for(int i=0;i<3;i++) { System.out.println("Java "+i); for(int j=0;j<2;j++) {
		 * System.out.println("Hello world! "+j); } System.out.println("Selenium "+i);
		 * 
		 * } }
		 */
		int i = 0;
		int j = 0;
		while (i < 3) {   //i=0,1
			while (j < 2) {    //j=0,1
				System.out.println("hellow world"); //hw 
				j++;
			}
			i++;
		}

	}
}
