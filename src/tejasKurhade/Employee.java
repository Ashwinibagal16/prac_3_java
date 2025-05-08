package tejasKurhade;

class Employee{

	String firstName = "Tejas";
	String lastName = "Kurhade";
	int employeeId = 1234;


	void display(){
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(employeeId);
	}
	
	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.display();
		System.out.println(obj);
		
	}
	
}
	