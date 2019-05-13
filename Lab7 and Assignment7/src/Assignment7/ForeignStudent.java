package Assignment7;

public class ForeignStudent extends Student{
		
	private String countryOfOrigin;
	private static int totalNumForeignStudents = 0;
	private MyDate dateOfEntryToCanada;
	
	public ForeignStudent(String studentName, int numberOfCoursesTaken, String countryOfOrigin, MyDate dateOfEntryToCanada){
		super(studentName, numberOfCoursesTaken);
		this.countryOfOrigin = countryOfOrigin;
		this.dateOfEntryToCanada = dateOfEntryToCanada;
	}
	
	public double computeFees(){
		return 1000.00 * getNumberOfCoursesTaken();
	}
	
	public String findCountry(){
		return countryOfOrigin;
	}
	
	/*This method returns true if the current object is less than the new object anotherStudent*/
	public boolean lessThan(Sortable anotherStudent){
		if (anotherStudent instanceof SeniorStudent){
			return false;
		}
		else if (anotherStudent instanceof ForeignStudent){
			if (getName().compareTo(((Student) anotherStudent).getName()) < 0){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return true;
		}
	}
	
	
}


