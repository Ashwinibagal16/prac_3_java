package jyotiSukhwal;

class EmployeeDetail{
	int empId;
	String empFirstName;
	String empLastName;
	int empSalary;
	
	void updateDetails(){
		empId = 123;
		empFirstName = "Jyoti";
		empLastName = "Sukhwal";
		empSalary = 5000; 
	}
	
	void updateSalary(){
		empSalary = empSalary + 2000;
	}
	
	void printDetails(){
		System.out.println("Employee id is: " + empId);
		System.out.println("Employee first name is: " + empFirstName);
		System.out.println("Employee last name is: " + empLastName);
		System.out.println("Employee salary is: " + empSalary);
	}
	
	public static void main(String[] args){
		EmployeeDetail ed= new EmployeeDetail();
		ed.updateDetails();
		ed.updateSalary();
		ed.printDetails();
	}
}