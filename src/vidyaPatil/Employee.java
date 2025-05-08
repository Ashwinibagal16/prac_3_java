package vidyaPatil;

class Employee{
	String firstName="Vidya";
	String lastName="Patil";
	int employeeId=25171;
	
	void displayEmpInfo(){
		System.out.println("Employee First Name is " + firstName);
		System.out.println("Employee Last Name is " + lastName);
		System.out.println("Employee Id is " + employeeId);
	}

	public static void main(String[] args){
		Employee e = new Employee();
		e.displayEmpInfo();
	}
}