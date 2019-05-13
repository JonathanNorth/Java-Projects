package Assignment7;

public abstract class CanadianStudent extends Student {



	public CanadianStudent(String studentName, int numberOfCoursesTaken) {
		super(studentName, numberOfCoursesTaken);
	}

	public String findCountry(){
		return "Canada";
	}
	
	
	
}
