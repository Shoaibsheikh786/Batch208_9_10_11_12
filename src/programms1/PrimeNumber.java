package programms1;

public class PrimeNumber {

	public static void main(String[] args) {

		// Prime number

		int n = 5; // this number i want to check is it prime or not
		int count = 0;

		// 1, 2 , 3, 4 ,5 =number =>5
		// 1 - 6 =number =>6
		// 1 - 7 =number =>7
		// 1 - n =number =>n

		for (int i = 1; i <=n; i++) 
		{
			
			if(n%i==0)
			{
				count++;
				
			}
		}
		if(count==2)
		{
			System.out.println("Prime number "+n);
		}
		else
		{
			System.out.println("Not Prime number "+n);
		}
	}
}
