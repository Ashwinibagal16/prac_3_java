package jyotiSukhwal;

class Employee{
	
	String firstName="Jyoti";
	String lastName="Sukhwal";
	int employeeId=5;
	
	void printDetails(){
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(employeeId);
	}
	
	public static void main(String[] args){
		Employee e=new Employee();
		e.printDetails();
	}
}