
import java.util.StringTokenizer;

public class Name {
	
	private String firstName, middleName, lastName;
	private static int totalTokens;
	
	/*Constructor, takes a string as input, the input should be the full name of an employee (middle name optional)*/
	public Name(String input){
		StringTokenizer myTokens = new StringTokenizer(input, " ");
		totalTokens = myTokens.countTokens();
		
		
		firstName = myTokens.nextToken();

		if (totalTokens == 3){ /*if middle name exist*/
			middleName = myTokens.nextToken();
			lastName = myTokens.nextToken();
			
		}
		else {
			lastName = myTokens.nextToken();
		}
	}
	
	/*Copy Constructor*/
	public Name(Name input){
		firstName = input.firstName;
		middleName = input.middleName;
		lastName = input.lastName;
	}
	
	/*setName takes a string (name) and changes the original name of the object to the new name inputed by the user*/
	public void setName(String newName){
		StringTokenizer myTokens = new StringTokenizer(newName, " ");
		totalTokens = myTokens.countTokens();
		
		firstName = myTokens.nextToken();
		
		if (totalTokens == 3){ /*if middle name exist*/
			middleName = myTokens.nextToken();
			lastName = myTokens.nextToken();
		}
		else {
			lastName = myTokens.nextToken();
		}
	}
	
	/*Returns the first name, middle name and last name as a string in the following format: Last Name, First Name (space if middle name exist) MiddleName*/
	public String toString(){
		
		if (totalTokens == 3){ /*if middle name exist*/
		return lastName + "," + " " + firstName + " " + middleName;
		}
		else {
			return lastName + "," + " " + firstName;
		}
	}
	
}
