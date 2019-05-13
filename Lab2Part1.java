import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab2Part1 {
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in); //To get the string from the user
		String inputString, evalToken, LongestToken; //String from the user, Token currently being evaluated, longesttoken found
		int numVowels = 0, numTokens; //# of total vowels in the input, number of total tokens in the input
		char currentposition;
		
		System.out.println("Please type a line of text:");
		inputString = keyboard.nextLine();

		//Tokenizing the string from the user
		StringTokenizer myTokens = new StringTokenizer(inputString, " ");
		LongestToken = myTokens.nextToken(); //The first token is the longest token by default
		System.out.println(""+LongestToken);
		
		//Normally I would make finding a vowel a method however we haven't learned that yet
		//This for loop looks to see how many vowels, aeiou, are found in the string
		for(int position = 0; position < LongestToken.length(); position ++){
			currentposition = LongestToken.charAt(position);
			currentposition = Character.toLowerCase(currentposition);
			if (currentposition == 'a' || currentposition == 'e' || currentposition == 'i' || currentposition == 'o' || currentposition == 'u') //Trying to find vowels
				numVowels ++;
		}
		
		//Loop goes until there's no more tokens remaining
		for (numTokens = myTokens.countTokens(); numTokens > 0; numTokens--){
			
			evalToken = myTokens.nextToken();
				if (LongestToken.length() < evalToken.length()){ //if the new token is longer than the current longest token, longest token is now the new token
					LongestToken = evalToken;
				}
			System.out.println("" + evalToken); //Print current token
			
			for(int position = 0; position < evalToken.length(); position ++){
				currentposition = evalToken.charAt(position);
				currentposition = Character.toLowerCase(currentposition);
				if (currentposition == 'a' || currentposition == 'e' || currentposition == 'i' || currentposition == 'o' || currentposition == 'u') //Trying to find vowels
					numVowels ++;
			}
			
		}
		System.out.println("The longest word is " + LongestToken);//Prints the results
		System.out.println("The number of vowels is " + numVowels);
	}
}

