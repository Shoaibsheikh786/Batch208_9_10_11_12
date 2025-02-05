package controlStructure;

public class Nestedif {

	public static void main(String[] args) {
    
		//nesting if --> if inside the if 
		 
		
		int a=10;
		int b=20;
		int c=30;
		if(a>b)                        	
		{  
			System.out.println("first if");
			if(a>c)
			{
				System.out.print("inside if");
				if(a>30)
				{
					System.out.println("java");
				}	
			}
			else
			{
				System.out.println("last if");
			}
			
		}
		
		
		
		
		
	}

}
