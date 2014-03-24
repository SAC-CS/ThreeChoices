import java.util.Scanner;
import java.util.Random;

public class ThreeChoices1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		int num1;
		int num2;
		String choice;
		
		System.out.println("Play Rock, Paper, Scissors.");
		System.out.println("Please choose rock , paper ,or scissors: ");
		choice = input.next();
		num1 = random.nextInt(2)+1;
		{
			switch (choice.toLowerCase())
			{
				case "rock":
					num2 = 1;
					if(num1==2)
					{
						System.out.println("I chose Paper. You Lose.");
					}
					else if(num1==3)
					{
						System.out.println("I chose Scissors. You Win.");
					}
					else
					{
						System.out.println("I chose Rock. We Tie.");
					}
					break;
					
				case "paper":
					num2 = 2;
					if(num1==1)
					{
						System.out.println("I chose Rock. You Win.");
					}
					else if(num1==3)
					{
						System.out.println("I chose Scissors. You Lose.");
					}
					else
					{
						System.out.println("I chose Paper. We Tie.");
					}
					break;
					
				case "scissors":
					num2 = 3;
					if(num1==1)
					{
						System.out.println("I chose Rock. You Lose.");
					}
					else if(num1==2)
					{
						System.out.println("I chose Paper. You Win.");
					}
					else
					{
						System.out.println("I chose Scissors. We Tie.");
					}
					break;
					
				default:
					System.out.println("You did not choose Rock,Paper,or Scissors. Please Try Again.");
					break;
			}
		}
		
	}

}

// Good job...please think about maintainability
