package manager_trainee_inheritence_practice;

public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager manager1 = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		System.out.println("Manager Salary: " + manager1.calculateSalary());
		System.out.println("Manager Transport Allowance: " + manager1.calculateTransportAllowance());
		
		
		Trainee trainee1 = new Trainee(29836, "Jack", "Mumbai India", 442085, 45000);
		System.out.println("Trainee Salary: " + trainee1.calculateSalary());
		System.out.println("Trainee Transport Allowance: " + trainee1.calculateTransportAllowance());
		
	}//public static void main(String[] args)
	
	
}//public class InheritanceActivity
