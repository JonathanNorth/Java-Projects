
public class Worker {
	
	private static int howManyWorkers = 0;
	private int workerNumber;
	private Name workerName;
	private MyDate dateJoiningCompany;
	private double Salary;
	private Worker Supervisor;
	
	/*Constructor, full name, date joined, salary*/
	public Worker(String fullName, String date, double salary){
		
		howManyWorkers++;
		workerName = new Name(fullName);
		dateJoiningCompany = new MyDate(date);
		Salary = salary;		
		workerNumber = howManyWorkers;
		
	}
	
	/*Second constructor, no salary*/
	public Worker(String fullName, String date){
		
		howManyWorkers++;
		workerName = new Name(fullName);
		dateJoiningCompany = new MyDate(date);
		Salary = 0.0;
		workerNumber = howManyWorkers;
	}
	
	/*Copy Constructor*/
	public Worker(Worker input){

		howManyWorkers ++;
		workerName = input.workerName;
		dateJoiningCompany = input.dateJoiningCompany;
		Salary = input.Salary;
		Supervisor = input.Supervisor;
		
	}
	
	/*Changes the salary of an employee*/
	public void setSalary(double newSalary){
		
		Salary = newSalary;	
	}
	
	/*sets the supervisor of an employee*/
	public void setSupervisor(Worker supervisorOfWorker){
		
		Supervisor = supervisorOfWorker;
		return ;
		
	}
	
	/*Total number of workers*/
	static int getHowManyWorkers(){
		
		return howManyWorkers;
	}
	
	/*retrieves the name of the supervisor of the employee */
	public Name getSupervisorName(){
		
		return Supervisor.workerName;
	}
	
	/*Returns a string with the following information and format: 
	 * Worker Number
	 * Worker Name
	 * Date Joined
	 * Supervisor name
	 * Salary*/
	public String toString(){
		
		/*If a Supervisor has been assigned*/
		if (Supervisor != null){
			return workerNumber + "\n" +  workerName + "\n" + dateJoiningCompany + "\n" + Supervisor.workerName  + "\n" + Salary;
		}
		/*If a supervisor hasn't been assigned the worker must be the CEO, therefore we replace Supervisor.workerName with CEO*/
		else{
			return workerNumber + "\n" +  workerName + "\n" + dateJoiningCompany + "\nCEO"  + "\n" + Salary;

		}
	}
}
