package operators;

public class LogicalOpe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		//Logic opertors : it will applied on boolean values 
		
		boolean a=false;
		boolean b=false;
		
		boolean c= a&&b;   // true &&  true ==> true (and--> both should be true)              
		
		System.out.println(c);
		
		//Logic OR || 
		
		boolean b1=a||b;       //only one is true --> output will true 
		System.out.println(b1);
		
		
		int num1=10;
		int num2=20;
		
		boolean num3=num1>num2;
		
		System.out.println(num3||false);
		
		
	}

}
