package com.multidimentionalArray;

public class MultiDim {

	public static void main(String[] args) {
     
//	 int arr[]= {1,4,2,9,0};
//	 
//	 System.out.println(arr[3]);
	 
	 /*1 3 5 6
	  *2 5 1 0
	  *9 8 6 7 */
	 
	 //rows 3 
	 //cols 4
	 //
	 int [][] arr=new int[3][4];
//	 
	 arr[0][0]=4;
	 arr[0][1]=5;
	 
	 arr[2][2]=4;
	 
//	 System.out.println(arr[0][0]);  //4
//	 System.out.println(arr[0][1]);  //5
//	 System.out.println(arr[0][2]);  //0
//	 System.out.println(arr[0][3]);  //0
//	 System.out.println(arr[1][0]);
	 
	 

	 
//	 for(int i=0;i<3;i++)
//	 {
//		 for(int j=0;j<4;j++)
//		 {
//			 System.out.print(arr[i][j]+" ");
//		 }
//		 System.out.println();
//	 }
//	 
	 
	 
	 
	 
	 
	 
	 
	 int arr2[][]= {{1,2,3,5},
			        {2,2,4,3}};     
	 //single dim X
	 //mutli dim  
	 // rows and cols --> 2 x 4
	 
	 for(int i=0;i<2;i++)
	 {
		 for(int j=0;j<4;j++)
		 {
			 System.out.print(arr2[i][j]+" ");
		 }
		 System.out.println();
	 }
	 
	
	 
	 
	 
	
	}

}
