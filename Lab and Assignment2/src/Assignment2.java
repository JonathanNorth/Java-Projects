/*This program is going to take a string, input from the user, and calculate the average of the student. The delimiters are " ;()/" and the grades can either be in the format num/num, num/ num, num /mum, num / num or
 * just num (in this case it will be num/100) */

import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment2 {
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in);
		String inputString, evalString, addString;
		StringTokenizer myTokens;
		int numTotalTokens= 0, numCurrentTokens, numerator = 0, denominator = 0, sumGrades = 0;
		
		System.out.println("Please type the scores");
		inputString = keyboard.nextLine();
		myTokens = new StringTokenizer(inputString, ",(); ");
		
		
		for (numCurrentTokens = myTokens.countTokens(); numCurrentTokens > 0; numCurrentTokens--){
			evalString = myTokens.nextToken();
			
			
			if (evalString.matches("[0-9]+/[0-9]+")){ //Standard case ex: num/num
				numerator = Integer.parseInt(evalString.substring(0,evalString.indexOf("/")));
				denominator = Integer.parseInt(evalString.substring(evalString.indexOf("/") + 1, evalString.length()));
				sumGrades += (numerator*100/denominator);

			}
			
			else if (evalString.indexOf("/") != -1){ //Case 2: num/ num
				evalString = evalString + myTokens.nextToken();
				numCurrentTokens --;
				numerator = Integer.parseInt(evalString.substring(0,evalString.indexOf("/")));
				denominator = Integer.parseInt(evalString.substring(evalString.indexOf("/") + 1, evalString.length()));
				sumGrades += (numerator*100/denominator);

			}
			
			else {
				
				if (evalString.indexOf("/") == -1 || numCurrentTokens -1 == 0 ){
					numerator = Integer.parseInt(evalString);
					sumGrades += (numerator/1);

				}
				else{
				addString = myTokens.nextToken();
				if (addString.equals("/")){  		//Case 3: num / num
					evalString = evalString + addString + myTokens.nextToken();
					numCurrentTokens -= 2;
					numerator = Integer.parseInt(evalString.substring(0,evalString.indexOf("/")));
					denominator = Integer.parseInt(evalString.substring(evalString.indexOf("/") + 1, evalString.length()));
					sumGrades += (numerator*100/denominator);

				}
				else if (addString.indexOf("/") != -1){ //Case 4: num /num
					evalString = evalString + addString;
					numCurrentTokens --;
					numerator = Integer.parseInt(evalString.substring(0,evalString.indexOf("/")));
					denominator = Integer.parseInt(evalString.substring(evalString.indexOf("/") + 1, evalString.length()));
					sumGrades += (numerator*100/denominator);
				}
						
			}
				
				
			
										
			}
			numTotalTokens++;
		}
	
	System.out.println ("The student's average is " + (float)sumGrades/numTotalTokens);	
	}

}
