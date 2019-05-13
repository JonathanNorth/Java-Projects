package Assignment7;

/*This class represents Canadian students who are over the age of 65*/
public class SeniorStudent extends CanadianStudent{
	
		private double pension;
		
		public SeniorStudent(String studentName, int numberOfCoursesTaken, double pension){
			super(studentName, numberOfCoursesTaken);
			this.pension = pension;
		}
		
		public double computeFees(){
			return 50.00;
		}
		
		public String toString(){
			return super.toString() + " senior citizen who gets pension $" + pension;
		}
		
		/*Returns true if the current object is less than the argument, anotherStudent*/
		public boolean lessThan(Sortable anotherStudent){
			if (anotherStudent instanceof SeniorStudent){									/*If the new object is of class SeniorStudent*/
				if (getName().compareTo(((Student) anotherStudent).getName()) < 0){			/*We check if the name of the current student is lexicographically smaller*/
					return true;															/*If studentName < anotherStudent's name then the current object iss less than*/
				}
				else{
					return false;
				}
			}
			else{																			/*Senior Student is the class that's less then any class*/
				return true;
			}
		}
		
	
}
