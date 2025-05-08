package vaibhavPatil;

class Employee{
	String firstName = "Vaibhav";
	String lastName = "Patil";
	int empId = 1234;
	
	void displayEmpDetails(){
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(empId);
	}
	
	public static void main(String[] args){
		Employee e = new Employee();
		e.displayEmpDetails();
	}
}