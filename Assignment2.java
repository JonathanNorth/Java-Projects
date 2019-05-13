import java.util.Scanner;
import java.util.StringTokenizer;

/* Reads a score from the user, fixes the format and converts to an int and outputs the final grade and average. Using stringtokenizer 
was a requirement */

public class Assignment2 {
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in);
		String inputString, evalString, checkSlash, addString;
		StringTokenizer myTokens, myTokens21;
		int numTotalTokens, numCurrentTokens, numerator, denominator, sumGrades = 0;
		
		System.out.println("Please type the scores");
		inputString = keyboard.nextLine();
		myTokens = new StringTokenizer(inputString, ",(); ");
		myTokens21 = new StringTokenizer(inputString, ",(); ");
		
		numTotalTokens = myTokens.countTokens();
		System.out.println(numTotalTokens);
		
		for (numCurrentTokens = myTokens.countTokens(); numCurrentTokens > 0; numCurrentTokens--){
			evalString = myTokens.nextToken();
	
			if (evalString.matches("[0-9]+/[0-9]+")){ //Standard case ex: num/num
				
			}
			
			else if (evalString.indexOf("/") != -1){ //Case 2: ex: num/ num
				evalString = evalString + myTokens.nextToken();
				System.out.println(evalString);
			}
			
			else {
				addString = myTokens.nextToken();
				if (addString.equals("/")){  
					evalString = evalString + addString + myTokens.nextToken();
					System.out.println(evalString);
				}
				else {
					evalString = evalString + addString;
					System.out.println(evalString);
				}
										
			}
			numerator = Integer.parseInt(evalString.substring(0,evalString.indexOf("/")));
			denominator = Integer.parseInt(evalString.substring(evalString.indexOf("/") + 1, evalString.length()));

			sumGrades += (numerator*100/denominator);
		}
	
	System.out.println ("The student's average is " + (float)sumGrades/numTotalTokens);	
	}

}
