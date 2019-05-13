package Assignment7;

/*This class represents a Canadian student below the age of 65*/
public class CanadianStudentUnder65 extends Student implements Sortable, FeeCalculator{
	
	public CanadianStudentUnder65(String studentName){
		super(studentName, 5);
		
	}
	
	
	public CanadianStudentUnder65(String studentName, int numberOfCoursesTaken){
		super(studentName, numberOfCoursesTaken);
	}
	
	public double computeFees(){
		if(getNumberOfCoursesTaken() >= 4){
			return 800;
		}
		else{
			return 200*getNumberOfCoursesTaken();
		}
	}


	/*Returns true if the current object is less than the argument*/
	public boolean lessThan(Sortable anotherStudent) {
		if (anotherStudent instanceof ForeignStudent){								/*Foreign Students are less than canadian students < 65*/
			return false;
		}
		else if(anotherStudent instanceof SeniorStudent){							/*Senior students are less than canadian students < 65*/
			return false;
		}
		else{
			if (getName().compareTo(((Student)anotherStudent).getName()) < 0){	/*anotherStudent is an instance of this class, check the name for alphabetical order*/
				return true;
			}
			else{
				return false;
			}
		}
	
	}
	
	


	public String findCountry() {
		return "Canada";
	}
	
	
}
