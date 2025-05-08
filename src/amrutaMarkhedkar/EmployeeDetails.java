package amrutaMarkhedkar;

class EmployeeDetails{
	int empId;
	String empFirstName;
	String empLastName;
	int empSalary;
	
	void initEmpDetails(){
		empId = 1122;
		empFirstName = "Amruta";
		empLastName ="Markhedkar";
		empSalary =10000;
	}
	
	void updateEmpSalary(){
		empSalary = empSalary + 2000;
	}
	
	void printEmpDetails(){
		System.out.println("Employee Id is :" + empId);
		System.out.println("Employee first name is :" + empFirstName);
		System.out.println("Employee last name is :" + empLastName);
		System.out.println("Employee current salary is :" + empSalary);
	}
	
	public static void main(String [] args){
		
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.initEmpDetails();
		employeeDetails.updateEmpSalary();
		employeeDetails.printEmpDetails();
	}
}