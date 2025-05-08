//Assignment 1
package jeetHingrajiya;
class Employee{
	String firstname = "Jeet";
	String lastname = "Hingarajia";
	int employeeId = 24;
	
	void display(){
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(employeeId);
	}
	
	public static void main(String[]args){
		Employee e = new Employee();
		e.display();  
	}
}