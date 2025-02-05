package operators;

public class UnaryOperators {
	//Unary oper  : ++(inc. operator) --(dec. operator)
	// !  --> 
	
	//they require only one operand 
	
	public static void main(String[] args) {
		//inc means add with 1
		//dec. mean dec with 1
		
		//a++ : post inc
		//++a : pre ince
		
		//--a:  pre dec
		int a=5;
		++a;
		int b=10;
		--b;
		System.out.println(a);
		System.out.println(b);
		
	}
}
