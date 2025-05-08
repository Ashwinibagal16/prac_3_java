package suchetaGhogare;

class EmployeeDetails{
	
	int empId;
	String empFirstName;
	String empLastName;
	int empSalary;

	void initEmpDetails(){
		empId=123;
		empFirstName="Sucheta";
		empLastName="Ghogare";
		empSalary=5000;
	}

	void updateEmpSalary(){
		empSalary = empSalary + 2000;
	}

	void printEmpDetails(){
		System.out.println("Employee id is " +empId);
		System.out.println("Employee first name is " +empFirstName);
		System.out.println("Employee last name is " +empLastName);
		System.out.println("Employee current salary is "+empSalary);
	}

	public static void main(String[] args){
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.initEmpDetails();
		employeeDetails.updateEmpSalary();
		employeeDetails.printEmpDetails();
	}
}