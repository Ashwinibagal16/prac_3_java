package chandniFatehchandani;

//---Assignment - 1 : 19th April'25
//---Write a program for below requirement.
//--Employee has firstname, lastname and employeeId (int), it should be printable.

class Employee{

	String firstname = "Chandni";
	String lastname = "Fatehchandani";

	int empID = 1385;
	
	void display(){
		
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(empID);
	}
	
	public static void main (String[] args){
		Employee E = new Employee();
		E.display();
	}
}