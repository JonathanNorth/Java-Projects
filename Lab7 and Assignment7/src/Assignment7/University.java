package Assignment7;

public class University {
	
	private Student[] listOfStudents;
	private int currentNumberOfStudents = 0;
	private int maximumNumberOfStudents;
	
	public University(int maximumNumberOfStudents){
		listOfStudents = new Student[maximumNumberOfStudents];
		this.maximumNumberOfStudents = maximumNumberOfStudents;
	}
	
	public boolean insertStudent(Student aStudent){
		int counter = 0;
		
		if(listOfStudents[listOfStudents.length - 1] != null){
			return false;
		}
		else{
			counter = 0;
			
			while (listOfStudents[counter] != null){
				counter++;
			}
			
			listOfStudents[counter] = aStudent;
			currentNumberOfStudents++;
			return true;
						
		}
				
	}
	
	public int numberOfStudents(String nameOfCountry){
		
		int studentsInCountry = 0; 
		
		for (int counter = 0; listOfStudents[counter] != null; counter++){
			if(listOfStudents[counter].findCountry().compareTo(nameOfCountry) == 0){
				studentsInCountry++;
			}
		}
		return studentsInCountry;
	}
	
	public String toString(){
		
		String returnString = "Number of Students In University = " + currentNumberOfStudents + "\n";
		
		for(int counter = 0; counter < currentNumberOfStudents; counter++){
			returnString = returnString + listOfStudents[counter] + "\n";
		}
		return returnString;
	}
	
	public void sortStudents(){
		
		Sort.sortAnything(listOfStudents, currentNumberOfStudents);
		
		return ;
	}
	
	//To sort a list of students in ascending order
	public void sortStudentsDescending(){
		SortDescending.sortAnything(listOfStudents, currentNumberOfStudents);
	}
	
	
}
