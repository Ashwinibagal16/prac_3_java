package chandniFatehchandani;

/*Create a class called EmployeeDetails,
empid, empFirstName, empLastName, empSalary.
craete a method to initialised empid, empFirstName, empLastName, empSalary.
create a method to update empSalary.
salary should be updated by 2000 rs.
printDetail method should print all the details of employee.
output :
Employee id is 123
Employee first name is Chandani
Employee last name is Fatehchandani
Employee current salary is 72000*/

class EmployeeDetails{
	
	int empid;
	String empFirstName;
	String empLastName;
	int empSalary;
	
	void inputDetails(){
		empid = 123;
		empFirstName = "Chandani";
		empLastName = "Fatehchandani";
		empSalary = 70000;
	}
	
	void updateempSalary(){
		empSalary = empSalary + 2000;
	}
	
	void printAllDetails(){
		System.out.println("Employee id of the employee is " + empid);
		System.out.println("Employee First Name is " + empFirstName);
		System.out.println("Employee Last Name is " + empLastName);
		System.out.println("Employee current salary is " + empSalary);
	}
	
	public static void main(String[] args){
		EmployeeDetails E = new EmployeeDetails();
		E.inputDetails();
		E.updateempSalary();
		E.printAllDetails();
	}
}
