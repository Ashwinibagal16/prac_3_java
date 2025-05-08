package pratikWaghmare;
class EmployeeDetails{

	int empid;
	String empFirstName;
	String empLastName;
	int empSalary;
	
	void initializeEmp(){
		empid = 123;
		empFirstName = "Pratik";
		empLastName = "Waghmare";
		empSalary = 5000;
	}
	
	void updateEmp(){
		empSalary = empSalary + 2000;
	}
	
	void displayEmp(){
		System.out.println("Employee ID is " + empid);
		System.out.println("Employee's first name is " + empFirstName);
		System.out.println("Employee's last name is " + empLastName);
		System.out.println("Employee's current salary is " + empSalary);
	}
	
	public static void main(String[] args){
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.initializeEmp();
		employeeDetails.updateEmp();
		employeeDetails.displayEmp();
		
	}


}