package pankajMiniyar;
class Employee{
	String firstName="Pankaj";
	String lastName="Miniyar";
	int employeeId=5;
	
	void display(){
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(employeeId);
	}
	
	public static void main(String[] args){
		Employee emp=new Employee();
		emp.display();
	}
}