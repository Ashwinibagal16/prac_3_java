//Assignment 3
package jeetHingrajiya;
class EmployeeDetails{
	int empId;
	String empFirstName;
	String empLastName;
	int empSalary;
	
	void updateEmployeeDetail(){
		empId = 2404;
		empFirstName = "Jeet";
		empLastName = "Patel";
		empSalary = 5000;
	}
	
	void updateSalary(){
		empSalary = empSalary + 2000;
	}
	
	void printEmployeeDetail(){
		System.out.println("Employee Id is " +empId);
		System.out.println("Employee FirstName is " +empFirstName);
		System.out.println("Employee LastName is " +empLastName);
		System.out.println("Employee Salary is " +empSalary);
	}
	
	public static void main(String[]args){
		EmployeeDetails employeedetails = new EmployeeDetails();
		employeedetails.updateEmployeeDetail();
		employeedetails.updateSalary();
		employeedetails.printEmployeeDetail();
	}
}