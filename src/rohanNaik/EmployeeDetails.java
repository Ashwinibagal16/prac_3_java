package rohanNaik;

class EmployeeDetails{
	
	int empid; 
	String empFirstName;
	String empLastName;
	int empSalary;
	
	void initialize(){
		empid = 123;
		empFirstName = "Maulik";
		empLastName = "Kanani";
		empSalary = 10000;
	}
	
	void updateSalary(){
		empSalary = empSalary + 2000;
	}
	
	void printDetails(){
		System.out.println("Employee ID is : " + empid);
		System.out.println("Employee First Name : " + empFirstName);
		System.out.println("Employee Last Name : " + empLastName);
		System.out.println("Employee Salary : " + empSalary);
	}
	
	public static void main(String args[]){
		EmployeeDetails empdetails = new EmployeeDetails();
		empdetails.initialize();
		empdetails.updateSalary();
		empdetails.printDetails();
	}
}