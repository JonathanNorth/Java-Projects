/*Checks to see if a name is valid, correct traits are: Mr or Ms (optional), First name (uppercase for the first letter), middle name (uppercase initial then a period or entire middle name with uppercase for the first letter) middle name is option
 * Last name (first letter needs to be uppercase). If the requirements are not met an error message is displayed, otherwise the program prints the first and last name*/

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab2Part2 {
	public static void main (String[] args){
		Scanner keyboard;
		String inputString, stringCompare; //the string entered by the user, used to compare strings
		keyboard = new Scanner(System.in);
		StringTokenizer myTokens; //Used to make tokens from the input
		int numTokens; //Keep track of the total number of tokens
		
		System.out.println("Please type the name for testing");
		inputString = keyboard.nextLine();
		myTokens = new StringTokenizer(inputString);
		numTokens = myTokens.countTokens();
		
		if (inputString.matches("(Mr|Ms)? ?[A-Z][a-z]+ ([A-Z]\\.|[A-Z][a-z]+)? ?[A-Z][a-z]+")){ //checks to see if the correct characteristics are met (see first comment)
				if(numTokens == 2){																//if there's only two tokens then the first one is the first name and the second is the last name
					System.out.println("First Name: " + myTokens.nextToken());
					System.out.println("Last Name: " + myTokens.nextToken());
					
				}
				else if(numTokens == 4){														//If there's four tokens then Mr or Ms and the middle name appears therefore the second and last tokens are the first and last name
					myTokens.nextToken();
					System.out.println("First Name: "+ myTokens.nextToken());
					myTokens.nextToken();
					System.out.println("Last Name: " + myTokens.nextToken());
				}
				else{																			//Last case is where there's only 3 tokens, either there's a Mr/Ms or a middle name has been entered
					stringCompare = myTokens.nextToken();
					if (stringCompare.equals("Mr")|| stringCompare.equals("Ms")){				//Checks to see if the first token is Mr or Ms, if true then the second and third tokens are the first and last name
						System.out.println("Firs Name: " + myTokens.nextToken());
						System.out.println("Last Name: " + myTokens.nextToken());
					}
					else{																		//Last case, 3 tokens, the first is not Mr or Ms, a middle name was included therefore the first and third tokens are the first and last name
						System.out.println("First Name: " + stringCompare);
						myTokens.nextToken();
						System.out.println("Last Name : " + myTokens.nextToken());				
										
					}
					
				}
				
			
		}
		else{
			System.out.println("Error: Name invalid");
		}
		
	}
}
