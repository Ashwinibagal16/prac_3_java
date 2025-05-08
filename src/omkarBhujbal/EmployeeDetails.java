package omkarBhujbal;

class EmployeeDetails{
	int empId = 123;
	String empFirstName = "Omkar";
	String empLastName = "Bhujbal";
	int empSalary = 5000;
	
	void updateSalary(){
		empSalary = empSalary + 2000;
		System.out.println("Updated Salary is : Rs. " + empSalary);
	}	
	void printDetails(){
		System.out.println("Employee id " + empId);
		System.out.println("Employee FirstName : " + empFirstName);
		System.out.println("Employee empLastName : " + empLastName);
		System.out.println("Employee Salary : Rs. " + empSalary);
	}	
	
	public static void main(String[] args){
		EmployeeDetails empDetails = new EmployeeDetails();
		empDetails.updateSalary();
		empDetails.printDetails();
	}	
}
