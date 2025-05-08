package najneenMalgave;

class Employee{
	String empName = "Najneen";
	int empAge = 30;
	int empSalary = 7000;
		
	void displayEmpDetails(){
		System.out.println(empName);
		System.out.println(empAge);
		System.out.println(empSalary);
	}
	
	public static void main(String[] args){
		Employee emp = new Employee();
		emp.displayEmpDetails();
	}
}