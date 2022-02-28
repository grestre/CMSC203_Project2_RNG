/*
 * Class: CMSC203 
 * Instructor:
 * Description: Generate a random number and guess the random number generated
 * Due: 2/23/2021
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Geronimo Restrepo
*/
import java.util.Scanner;
public class RandomNumberGuesser 
{
	public static void main(String[] args) {
			do
			{	
				int randNum, nextGuess = 0; 
				int highGuess = 100;  
				int lowGuess = 1;
			RNG.resetCount();
			randNum = RNG.rand();
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter your first guess");
			nextGuess = keyboard.nextInt();		
			do
			{			
				RNG.inputValidation(nextGuess, lowGuess, highGuess);
				{
					System.out.println("Number of guesses is "+ RNG.getCount());
				if (nextGuess < randNum && (randNum-nextGuess)<(randNum-lowGuess))
				{
					System.out.println("Your guess is too low");
					lowGuess=nextGuess;
				}
				if (nextGuess > randNum && (nextGuess-randNum)<(highGuess-randNum))
				{
					System.out.println("Your guess is too high");
					highGuess=nextGuess;
				}
					System.out.println("Enter your next guess between " +lowGuess+ " and " + highGuess);
					nextGuess=keyboard.nextInt();
				
			}
		}while(nextGuess != randNum);
			if(randNum == nextGuess)
			{
		 System.out.println("Congratulations, you guessed correctly\nTry again? (yes or no)");
		 Scanner b = new Scanner(System.in);
			String option = b.nextLine();
			if(option.equalsIgnoreCase("no"))
			{
				System.out.println("Thanks for playing...");
				break;
			}
			}
		}while(true);
	}
}
	