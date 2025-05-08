package umakantSahani;

class Employee{
	String firstname = "Umakant";
	String lastname = "Sahani";
	int employeeId = 71;
	
	void display(){
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(employeeId);
	}
	
	public static void main(String[] args){
		Employee employee = new Employee();
		employee.display();
	}
}