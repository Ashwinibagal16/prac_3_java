package harshMandhana;

class EmployeeDetails
{
	int empId;
	String empFirstName;
	String empLastName;
	int empSalary;

	void updateDetails()
	{
		empId = 12;
		empFirstName = "Harsh";
		empLastName = "Mandhana";
		empSalary = 2000;
	}
	
	void updateSalary()
	{
		empSalary = empSalary+3000;
	}
	
	void printDetails()
	{
		System.out.println("Employee ID is: "+ empId);
		System.out.println("Employee First name is: "+ empFirstName);
		System.out.println("Employee Last name is: "+ empLastName);
		System.out.println("Employee Salary is: "+ empSalary);
	}
	
	public static void main(String args[])
	{
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.updateDetails();
		employeeDetails.updateSalary();
		employeeDetails.printDetails();
	}
}