import java.util.Scanner;

public class ModChallenges
	{

		private static final int value = 0;

		public static void main(String[] args)
			{
				doChallenge1();
				doChallenge2();
				doChallenge3();
				doChallenge4();

			}
		
		public static void doChallenge1()
		{
			int x;
			Scanner input = new Scanner(System.in);
		    x = input.nextInt();
				if(x % 2==0)
					System.out.println(" Even");
				else
					System.out.println(" Odd");
				
			}
	
		
		public static void doChallenge2()
		{
		int x;
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
			if(x % 4 == 0)
				System.out.println(" is a leap year");
			else
				System.out.println(" is not a leap year");
		}
		
		public static void doChallenge3()
		{
		int []number={2, 5, -7, 1, 3, 12, 19, -16, 4, 20};
			for (int i=0  ; i<number.length; i++)
			{
			  if (i % 3 == 0)
				{
			    System.out.println(number[i]);
				}
			}
		}
		
		public static void doChallenge4()
		{
		int x;
		for(int i=1; i<=100; i++)
			{
			x=i;
			if(x%3==0 && x%5==0)
				System.out.println("FizzBuzz");
			else if(x%3==0)
				System.out.println("Fizz");
			else if(x%5==0)
				System.out.println("Buzz");
			
			else
				System.out.println(i);
				
		}   
	}	
}
