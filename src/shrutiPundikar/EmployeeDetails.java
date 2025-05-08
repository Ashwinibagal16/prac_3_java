package shrutiPundikar;

class EmployeeDetails{
	int empId;
	String empFirstName;
	String empLastName;
	int empSalary;
	
	void updateDetails(){
		empId=610;
		empFirstName="Shruti";
		empLastName="Pundikar";
		empSalary=5000;
	}
	
	void updateSalary(){
		empSalary = empSalary + 2000;
	}
	
	void printDetails(){
		System.out.println("Employee id is " + empId);
		System.out.println("Employee First name is " + empFirstName);
		System.out.println("Employee Last name is " + empLastName);
        System.out.println("Employee Salary is " + empSalary);	
	}
	
	public static void main(String[] args){
		EmployeeDetails empdetails = new EmployeeDetails();
		empdetails.updateDetails();
		empdetails.updateSalary();
		empdetails.printDetails();
	}
	
}