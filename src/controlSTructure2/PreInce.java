package controlSTructure2;

public class PreInce {

	public static void main(String[] args) {
   
		int a=10;
		int b;
		
		//post inc, we use ++ at the end of the variable
		b=a++; //two operators : assignmetn and post inc
		                  //post inc. has least priority 
		
		System.out.println("a--> "+a);
		System.out.println("b--> "+b);
	}

}
