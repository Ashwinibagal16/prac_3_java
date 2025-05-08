package amrutaMarkhedkar;

class Employee{
	String firstname = "Amruta";
	String lastname = "Markhedkar";
	int employeeId =1122;
	
	void employeeInfo(){
		System.out.println("Employee's firstname : " +firstname);
		System.out.println("Employee's lastname : " +lastname);
		System.out.println("Employee's employeeId : " +employeeId);
	}
	
	public static void main(String [] args){
		Employee employee = new Employee();
		employee.employeeInfo();
	}
}