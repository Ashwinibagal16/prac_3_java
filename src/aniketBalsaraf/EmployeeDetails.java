package aniketBalsaraf;

class EmployeeDetails{
	int empId ;
	String firstName;
	String lastName;
	int empSalary;
	
	void updateEmployeeDetails(){
		empId =123;
		firstName = "Aniket";
		lastName = "Balsaraf";
		empSalary = 5000;
	}
	
	void updateEmpSalary(){
		empSalary = empSalary + 2000;
	}
	
	void printDetails(){
		System.out.println("Employee id is " + empId);
		System.out.println("Employee first name is " + firstName);
		System.out.println("Employee last name is " + lastName);
		System.out.println("Employee current salary is " + empSalary);
	}
	
	public static void main(String[] args){
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.updateEmployeeDetails();
		employeeDetails.printDetails();
	}
}