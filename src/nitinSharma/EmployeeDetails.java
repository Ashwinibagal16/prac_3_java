package nitinSharma;
class EmployeeDetails{
	
	String empFirstName;
	String empLastName;
	int empId;
	int empSalary;
	
	void empId(){
		empId = 205859;
		System.out.println("Employee id is: "+ empId);
	} 
	
	void empName(){
		empFirstName = "Nitin";
		empLastName = "Sharma";
		System.out.println("Employee name is: "+ empFirstName + " " + empLastName);
	}
	
	void empSalary(){
		empSalary = 5000;
		System.out.println("Employee salary is: "+ empSalary);
	}
	void updateSalary(){
		 empSalary = empSalary+2000;
		 System.out.println("Employee updated salary is: "+ empSalary);
	}
	
	public static void main(String[] args){
		EmployeeDetails employeeDetails= new EmployeeDetails();
		employeeDetails.empName();
		employeeDetails.empId();
		employeeDetails.empSalary();
		employeeDetails.updateSalary();
	}

}