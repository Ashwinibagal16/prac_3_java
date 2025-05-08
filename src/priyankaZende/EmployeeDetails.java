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
package priyankaZende;
class EmployeeDetails{
	
	int empid;
	String empFirstName;
	String empLastName;
	int empSalary;
	
	void updateEmpDetails(){
		empid = 123;
		empFirstName = "Maulik";
		empLastName = "Kanani";
		empSalary = 5000;
	}

	void updateSalary(){
		empSalary = empSalary + 2000;
	}
	
	void printDetail(){
		System.out.println("Employee id is: "+ empid);
		System.out.println("Employee first name is: "+ empFirstName);
		System.out.println("Employee last name is: "+ empLastName);
		System.out.println("Employee current salary is: "+ empSalary);
	}

	public static void main(String[] args){
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.updateEmpDetails();
		employeeDetails.updateSalary();
		employeeDetails.printDetail();
	}
}	