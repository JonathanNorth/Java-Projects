package Assignment7;

public abstract class Student implements FeeCalculator, Sortable{
	
	private static int numTotalStudents = 0;
	private int studentNumber;
	private String studentName;
	private int numberOfCoursesTaken;
	
	
		public Student(String studentName, int numOfCoursesTaken){
			this.studentName = studentName;
			this.numberOfCoursesTaken = numOfCoursesTaken;
			numTotalStudents += 1;
			studentNumber = numTotalStudents;
		}
		
		
		public Student(String name){
			studentName = name;
			numberOfCoursesTaken = 5;
			numTotalStudents += 1;
			studentNumber = numTotalStudents;
			}
		
		public String getStudentName(){
			return studentName;
		}
		
		public int getnumberOfCoursesTaken(){
			return numberOfCoursesTaken;
		}
				
		public abstract String findCountry();
	
		
		public String getName(){
			return studentName;
		}
	
		public int getNumberOfCoursesTaken(){
			return numberOfCoursesTaken;
		}
	
		
		public String toString(){
		
			return "Student #:" + studentNumber + ", Name:" + studentName + " is from " + findCountry() + "; pays fees $" + computeFees();
		}
	
}
