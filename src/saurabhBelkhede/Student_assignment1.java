package saurabhBelkhede;
//Assignment 1
class Employee {
	String fName = "Sam";
	String lName = "Fisher";
	int empId = 11;
	
	void display(){
		System.out.println( fName);
		System.out.println( lName);	
		System.out.println( empId);
	}
	public static void main (String[] args){
		Employee emp= new Employee();
		emp.display();
}
}