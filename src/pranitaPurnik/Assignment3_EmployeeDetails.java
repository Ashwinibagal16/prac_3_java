/*Assignment - 3 : 20th April'2025

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
Employee current salary is 7000*/

package pranitaPurnik;

class Assignment3_EmployeeDetails{
	int empId;
	String empFirstName;
	String empLastName;
	int empSalary;
	
	void updateDetails(){
		empId=12345;
		empFirstName="Pranita";
		empLastName="Dagaonkar";
		empSalary=60000;
	}
	
	void updateSalary(){
		empSalary = empSalary+2000;
	}
	
	void printDetails(){
		System.out.println("Employee id is "+empId);
		System.out.println("Employee first name is "+empFirstName);
		System.out.println("Employee last name is "+empLastName);
		System.out.println("Employee current salary is "+empSalary);	
	}
	
	public static void main (String [] args){
		Assignment3_EmployeeDetails  assignment3_EmployeeDetails = new Assignment3_EmployeeDetails();
		assignment3_EmployeeDetails.updateDetails();
		assignment3_EmployeeDetails.updateSalary();
		assignment3_EmployeeDetails.printDetails();	
	}

}