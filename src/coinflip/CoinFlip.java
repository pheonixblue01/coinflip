package coinflip;


import java.util.Scanner;

public class CoinFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Asks the user to guess a coin flip
		

		    // Prompt user to guess heads or tails
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Enter heads or tails: ");
		    String userInput = sc.nextLine();
		    if (!userInput.equalsIgnoreCase("heads") &&
		        !userInput.equalsIgnoreCase("tails")) {
		      System.out.println("Sorry, you didn't enter heads " +
		                         "or tails; please try again.");
		      return;
		    }      
		 // Choose a random number
		    double randomNumber = Math.random();
			
		    // Determine whether user guessed correctly
		    if (userInput.equalsIgnoreCase("heads") && 
		        randomNumber < 0.5)
		      System.out.println("You win!");
		    else if (userInput.equalsIgnoreCase("tails") &&
		             randomNumber >= 0.5)
		      System.out.println("You win!");
		    else
		      System.out.println("Sorry, you lose.");
		  
		    /* After reading the user’s input, the program validates it, 
		    to make sure that it meets the requirements of the program.
		    */

	
	
	}
		
	}


