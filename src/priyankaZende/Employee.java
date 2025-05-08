/*Assignment - 1 : 19th April'25

Write a program for below requirement.
Employee has firstname, lastname and employeeId (int), it should be printable.

output : 
Maulik
Kanani
1212*/
package priyankaZende;
class Employee{
	String firstname = "Priyanka";
	String lastname = "Zende";
	int employeeId = 1212;
	
	void displayInfo(){
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(employeeId);
	}

	public static void main(String[] args){
		Employee emp = new Employee();
		emp.displayInfo();
	}
}