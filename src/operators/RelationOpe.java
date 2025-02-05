package operators;

public class RelationOpe {
	
	//Comprasion operators: the output of the operators are boolean value
	

	public static void main(String[] args) {
     
		// 1 > 5 : --> false 
		// 1 < 5 : --> true
		// 1 <= 5 : --> true
		// 1 <= 1 : --> true 
		// 1 >= 1 : --> true
		// 1 >=0  : ---> true 
		
		//  -5 > 0 : --> false
		// -7 > -9 : ---> true
		
		// ==
		// __!=__
		
		int a=100;
		int b =20;
		
		 boolean bool=  a>b ; 
		
		System.out.println(bool);
		System.out.println(a<b);
		System.out.println(a!=b);
		
		System.out.println(!true);
	}

}
