package rahulAlagoudar;

class EmployeeDetails{
	int empId=12;
	String empFirstName = "Rahul";
	String empLastName = "Alagoudar";
	int empSalary = 10000;
	
	void Salary(){
		empSalary = empSalary + 2000;
	}
	
	void PrinDetails(){
		System.out.println("Employee ID is:"+empId);
		System.out.println("Employee First Name is:"+empFirstName);
		System.out.println("Employee Last Name is:"+empLastName);
		System.out.println("Employee Salary is:"+empSalary);
	}
	
	public static void main (String[] args) {
		EmployeeDetails empd = new EmployeeDetails();
		System.out.println("Original salary:"+empd.empSalary);
		empd.Salary();
		empd.PrinDetails();
	}
}