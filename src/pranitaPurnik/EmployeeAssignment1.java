//Assignment1:- WAP for below requirements.Employee has firstname,lastname and employeeId(int),it should be printable.
package pranitaPurnik;
class EmployeeAssignment1{
	String firstName = "Pranita";
	String lastName = "Puranik";
	int employeeId = 545185;
	
	void employeeData(){
		System.out.println("Firstname of employee is : " +firstName);
		System.out.println("Lastname of employee is : " +lastName);
		System.out.println("Employee Id is : " +employeeId);
		System.out.println(firstName+ " This is firstname of employee.");
		System.out.println("Firstname of employee is : " + firstName +" and Lastname of employee is : " +lastName);
		
	}
	
	public static void main(String[] args){
		EmployeeAssignment1 e1 = new EmployeeAssignment1();
		e1.employeeData();
	}
}