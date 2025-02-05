package controlStructure;

public class GreatestOfThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=200;
		int c=30;
		
		//if --> a > b and a > c --> a is greather b and c 
		//else if --> 
		
		if(a>b&&a>c)
		{
			System.out.println("a is greater than b and c");
		}
		else if(b>a&&b>c)
		{
			System.out.println("b is greater than a and c");
		}
		else
		{
			System.out.println("c is greater than a and b ");
		}

	}

}
