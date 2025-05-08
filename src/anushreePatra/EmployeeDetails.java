package anushreePatra;

class EmployeeDetails{
	int empid = 123;
	String empFirstName = "Anu";
	String empLastName = "Patra";
	int empSalary = 5000;
	
	void empid(){
		System.out.println("Employee id is " + empid);
	}
	
	void empFirstName(){
		System.out.println("Employee first name is " + empFirstName);
	}
	
	void empLastName(){
		System.out.println("Employee last name is " + empLastName);
	}
	
	void empSalary(){
		System.out.println(empSalary);
	}
	
	void updateEmpSalary(){
		int updateEmpSalary = empSalary + 2000;
		System.out.println("Employee current salary is " + updateEmpSalary);
	}
	
	public static void main(String[] args){
		EmployeeDetails employeedetails = new EmployeeDetails();
		employeedetails.empid();
		employeedetails.empFirstName();
		employeedetails.empLastName();
		employeedetails.updateEmpSalary();
}
	}