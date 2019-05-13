/*This program takes a date from the user and test to see if it follows the correct format.
 * DD/MM/YY, DD for day (1-31), MM for month (01-12), YY for year (can't exceed 14).
 * The results are printed for the user.*/

import java.util.Scanner;

public class Assignment2part2 {
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in);
		String inputString;  						//date from the user
		
		System.out.println("Please type the date that you would like to test");
		inputString = keyboard.nextLine();
		
		if (inputString.matches("(([0-2][0-9])|([3][01]))(-|/)(0[1-9]|1[0-2])(-|/)([01][0-4])")){ //checking if the date follows the correct format
			System.out.println("The date " + inputString + " is valid");
		}
		else{
			System.out.println("The date " + inputString + " is not valid");
		}
	}
}
