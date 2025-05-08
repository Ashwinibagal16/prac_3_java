package vivekRahate;
class EmployeeDetails{
	int empID;
	String empFirstName;
	String empLastName;
	int empSalary;
	
	void initialisedEmployee(){
		empID = 1001;
		empFirstName = "Vivek";
		empLastName = "Rahate";
		empSalary = 4000;
	}
	
	void updateSalary(){
		empSalary = empSalary+2000;
	}
	
	void printEmployeeDetail(){
		System.out.println("Employee ID = " + empID);
		System.out.println("Employee First Name = " + empFirstName);
		System.out.println("Employee Last Name = " + empLastName);
		System.out.println("Employee Salary = " + empSalary);
	}
	
	public static void main(String args[]){
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.initialisedEmployee();
		employeeDetails.updateSalary();
		employeeDetails.printEmployeeDetail();
	}
}