package umakantSahani;

class EmployeeDetails {
	int empid;
	String empFirstName;
	String empLastName;
	int empSalary;
	
	void updateEmployeeDetails(){
		empid = 123;
		empFirstName = "Umakant";
		empLastName = "Sahani";
		empSalary = 5000;
	}
	
	void updateSalary(){
		empSalary = empSalary + 2000;
	}
	
	void printDetails(){
		System.out.println("Employee id is  " + empid);
		System.out.println("Employee first name is  " + empFirstName);
		System.out.println("Employee last name is  " + empLastName);
		System.out.println("Employee current salary is  " + empSalary);
	}
	
	public static void main(String[] args){
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.updateEmployeeDetails();
		employeeDetails.updateSalary();
		employeeDetails.printDetails();
	}
}