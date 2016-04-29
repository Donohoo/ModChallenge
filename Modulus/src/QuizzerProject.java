import java.util.Scanner;
public class QuizzerProject
{
		public static void main(String[] args)
			{	
			int counter = 0;
		for(int i=0; i<5 ; i++)
			{
			int randomnumber = (int)(Math.random()*5) + 1;
			int randomnumber1 = (int)(Math.random()*5) + 1;
			System.out.println(randomnumber +  "%" + randomnumber1 + "=");
			Scanner input = new Scanner(System.in);
			int answer = input.nextInt();
				if (randomnumber%randomnumber1 == answer)
					{
					System.out.println("Correct");
					counter++;
					}
			else
					System.out.println("Incorrect");
			}
				System.out.println("You got " + counter++ + " correct");
			}
		}

 