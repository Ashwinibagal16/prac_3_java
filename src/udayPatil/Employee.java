package udayPatil;
class Employee{
	String firstName = "Uday";
	String lastName  = "Patil";
	int employeeId   = 101;
	
	void display(){
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(employeeId);
	}
	
	public static void main(String[] args){
	Employee emp = new Employee();
	emp.display();
	}
}