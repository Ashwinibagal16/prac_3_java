
package omkarBhujbal;
class Employee{
	String firstname="Omkar";
	String lastname="Bhujbal";
	int empid=07;
	
	void display(){
		System.out.println("Employee id is " + empid + "Employee firstname is " + firstname + "Employee lastname is " + lastname);
		
	}
	public static void main(String[] args){
		Employee emp=new Employee();
		emp.display();
	}
}