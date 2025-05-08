package mayurKamble;

class EmployeeDetails{
	int empid;
	String empFirstName;
	String empLastName;
	int empSalary;
	
	void initiateEmpDetails(){
		empid=123;
		empFirstName="Mayur";
		empLastName="Kamble";
		empSalary=5000;
	}
	
	void updateSalary(){
		empSalary=empSalary+2000;
	}
	
	void printDetail(){
		System.out.println("Employee ID is "+empid);
		System.out.println("Employee First Name is "+empFirstName);
		System.out.println("Employee Last Name is "+empLastName);
		System.out.println("Employee Current Salary is "+empSalary);
	}
	
	public static void main(String[]args){
		EmployeeDetails employeeDetails= new EmployeeDetails();
		employeeDetails.initiateEmpDetails();
		employeeDetails.updateSalary();
		employeeDetails.printDetail();
	}
}