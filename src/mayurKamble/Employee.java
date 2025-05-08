package mayurKamble;

class Employee{
	
	String firstName="Mayur";
	String lastName="Kamble";
	int employeeId=1234;
	
	void displayDetails(){
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(employeeId);	
	}
	
	public static void main(String[]args){
		Employee emp= new Employee();
		emp.displayDetails();
	}
}