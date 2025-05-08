package anushreePatra;

class Employee{
	String firstName = "Anushree";
	String lastName = "Patra";
	int empId = 1256;
	
	void display(){
		System.out.println("Employee Name is " +firstName + ".");
		System.out.println(lastName);
		System.out.println(empId);
	}
		
	public static void main(String[] args){
		Employee e = new Employee();
		e.display();
	}	
}