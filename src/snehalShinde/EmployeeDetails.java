package snehalShinde;

class EmployeeDetails{

	int empid = 1234;
	String empFirstName = "Snehal";
	String empLastName = "Shinde";
	int empSalary = 5000;
	
	void updateEmpSal(){
		empSalary = empSalary + 2000;
	}
	
	void employeeDetails(){
		System.out.println("Employee ID is " + empid + ".");
		System.out.println("Employee first name is " + empFirstName + ".");
		System.out.println("Employee last name is " + empLastName + ".");
		System.out.println("Employee current salary is " + empSalary + " INR.");
	}
	
	public static void main(String[] args){
		EmployeeDetails empdetails = new EmployeeDetails();
		empdetails.updateEmpSal();
		empdetails.employeeDetails();
	}
}