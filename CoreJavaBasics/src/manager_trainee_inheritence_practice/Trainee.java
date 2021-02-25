package manager_trainee_inheritence_practice;

public class Trainee extends Employee{

	public Trainee() {
		super();
	}
	
	public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
		super(employeeId, employeeName, employeeAddress, employeePhone);
		this.basicSalary = basicSalary;
	}
	

}//public class Trainee
