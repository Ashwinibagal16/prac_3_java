/*
 Assignment 3 --
Create a class called EmployeeDetails,
empid, empFirstName, empLastName, empSalary.

craete a method to initialised empid, empFirstName, empLastName, empSalary.
create a method to update empSalary.
salary should be updated by 2000 rs.
printDetail method should print all the details of employee.

output :
Employee id is 123
Employee first name is Maulik
Employee last name is Kanani
Employee current salary is 7000
*/
package madhuriMalvi;
class EmployeeDetails{	
	int empId,empSalary;
	String empFirstName, empLastName;
	
	void setDetails(){
		empId = 123;
		empFirstName = "Madhuri";
		empLastName = "Malvi";
		empSalary = 5000;
	}
	void updateSalary(){
		empSalary = empSalary + 2000;
	
	}
	void printDetails(){
		System.out.println("Employee id  is " + empId);
		System.out.println("Employee First name is " + empFirstName);
		System.out.println("Employee Last Name is " + empLastName);
		System.out.println("Employee current Salary is " + empSalary);
    }
	
	public static void main(String[] args){
		EmployeeDetails employeedetails = new EmployeeDetails();
		employeedetails.setDetails();
		employeedetails.updateSalary();
		employeedetails.printDetails();
    }
}