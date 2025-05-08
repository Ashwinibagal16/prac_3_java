package pratikWaghmare;

class Employee{

	String firstName = "Pratik";
	String lastName = "Waghmare";
	int employeeId = 12345;
	
	void showEmplyeeDetails(){
	
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(employeeId);
	}
	
	public static void main(String[] args){
	
		Employee E = new Employee();
		E.showEmplyeeDetails();
	}
	

}