package vidyaPatil;

class EmployeeDetails{
		
	int empId;
	String empFirstName;
	String empLastName;
	int empSalary;

	void initialize(){
		empId = 25171;
		empFirstName = "Vidya";
		empLastName = "Patil";
		empSalary = 5000;		
	}
	
	void updateSalary(){
		empSalary = empSalary + 2000;
	}
	
	void printData(){
		System.out.println("Employee Id is : " + empId);
		System.out.println("Employee First Name is : " + empFirstName);
		System.out.println("Employee Last Name is : " + empLastName);
		System.out.println("Employee Current Salary is : " + empSalary);
	}
	
	public static void main(String[] args){
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.initialize();
		employeeDetails.updateSalary();
		employeeDetails.printData();
	}

}