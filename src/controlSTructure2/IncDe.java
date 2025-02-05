package controlSTructure2;

public class IncDe {

	public static void main(String[] args) {
      
		int a=10;
		int c=a++;       //post inc. has least priority 
		System.out.println("a-> "+a);
		System.out.println("c-> "+c);
	}

}
