package manager_trainee_inheritence_practice;

public class Manager extends Employee{

	public Manager() {
		super();
	}
	
	public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
		super(employeeId, employeeName, employeeAddress, employeePhone);
		this.basicSalary = basicSalary;
	}
	
	@Override
	public double calculateTransportAllowance() {
		double transportAllowance = .15*basicSalary;
		return transportAllowance;
	}
	
}//public class Manager
