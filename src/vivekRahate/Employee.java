package vivekRahate;
class Employee{
	String firstName = "Vivek";
	String lastName = "Rahate";
	int employeeId = 1103;
	
	void update(){
		firstName = "Vijay";
		lastName = "Raut";
		
		int age = 56;
	}
	
	void employeeDisplay(){
		System.out.println("Employee First Name = "+ firstName);
		System.out.println("Employee Last Name = " + lastName);
		System.out.println("Employee ID = " + employeeId);
	}
	
	public static void main(String a[]){
		Employee employee = new Employee();
		//Employee employee1 = new Employee();
		employee.employeeDisplay();
		//System.out.println(age);
		//System.out.println(employee.employeeId);
		//System.out.println(employee);
		//System.out.println(employee1);
	}
}