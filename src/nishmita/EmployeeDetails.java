//A-3
package nishmita;
class EmployeeDetails{
	int empId;
	String empFirstName;
	String empLastName;
	int empSalary;

	void updateEmpDetails(){
		empId=123;
		empFirstName="Nishmitha";
		empLastName="Kullamapdy";
		empSalary=5000;
	}

	void updateEmpSalary(){
		empSalary=empSalary+2000;
	}

	void printEmpDetails(){
		System.out.println("Employee Id is "+empId);
		System.out.println("Employee First Name is "+empFirstName);
		System.out.println("Employee Last Name is "+empLastName);
		System.out.println("Employee Salary is "+empSalary);
	}

	public static void main(String[] args){
		EmployeeDetails emp=new EmployeeDetails();
		emp.updateEmpDetails();
		emp.updateEmpSalary();
		emp.printEmpDetails();
	}
}