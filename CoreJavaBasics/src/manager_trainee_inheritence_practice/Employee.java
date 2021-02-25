package manager_trainee_inheritence_practice;

public class Employee {

	 long employeeId;
	 String employeeName;
	 String employeeAddress;
	 long employeePhone;
	 double basicSalary;
	 double specialAllowance;
	 double hra;
	
	 
	 public Employee() {
		 specialAllowance = 250.80;
		 hra = 1000.50;
	 }

	public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		specialAllowance = 250.80;
		hra = 1000.50;
	}
	
	public double calculateSalary() {
		double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100);
		return salary;
	}
	
	public double calculateTransportAllowance() {
		double transportAllowance = .1*basicSalary;
		return transportAllowance;
	}
	
}//public class Employee 
