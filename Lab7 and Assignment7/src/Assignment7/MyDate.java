package Assignment7;

import java.util.StringTokenizer;

public class MyDate {
	private int day, month, year;
	private String date;
	
	/*Constructor, input should be in the following format "DD/MM/YYYY"*/
	public MyDate(String input){
		StringTokenizer myTokens = new StringTokenizer(input, "/");

		day = Integer.parseInt(myTokens.nextToken());
		month = Integer.parseInt(myTokens.nextToken());
		year = Integer.parseInt(myTokens.nextToken());
		
	}
	
	public MyDate(MyDate input){
		
		day = input.day;
		month = input.month;
		year = input.year;
		
	}
	
	public void printInfo(){
		System.out.println("Date: "+ date + "  Month: " + month + "   Year: " + year);
		
	}

	/*toString method, converts the date in the following format: name of month + space + date + comma + space + apostrophe + last 2 digits of year*/
	public String toString(){
		String nameMonth;
		
		switch(month){
		case 1: nameMonth = "January"; break;
		case 2: nameMonth = "February"; break;
		case 3: nameMonth = "March"; break;
		case 4: nameMonth = "April"; break;
		case 5: nameMonth = "May"; break;
		case 6: nameMonth = "June"; break;
		case 7: nameMonth = "July"; break;
		case 8: nameMonth = "August"; break;
		case 9: nameMonth = "September"; break;
		case 10: nameMonth = "October"; break;	
		case 11: nameMonth = "November"; break;	 	
		default: nameMonth = "December"; break; 
		}
		
		return nameMonth + " " + day + "," + " " + "'" + year%100;
		
	}
	
	/*Compares two dates, if the one in the argument is less than the current object then the function returns false, otherwise true*/
	public boolean lessThan(MyDate compare){
		if (year > compare.year){
			return false;
		}
		else if (month > compare.month){
			return false;
		}
		
		else if (day > compare.day){
			return false;
		}
		else {
			return true;
		}
		
	}

	/*Compares the current object to another object and returns true if they're equal, otherwise false*/
	public boolean equals(MyDate object2) {
		if (day != object2.day)
			return false;
		if (month != object2.month)
			return false;
		if (year != object2.year)
			return false;
		return true;
	}

	
	
}