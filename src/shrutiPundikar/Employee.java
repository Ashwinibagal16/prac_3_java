package shrutiPundikar;

class Employee{
	String firstName="Shruti";
	String lastName="Pundikar";
	int employeeId=610;
	
	void display(){
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(employeeId);
	}
	
	public static void main(String args[]){
		Employee emp= new Employee();
		emp.display();
	}
}