package jayaSahu;

class Employee{

     int empId=123;
	 String empName="Credits";
	 
	 void display(){
	      System.out.println("Employee id is "+ empId);
		  System.out.println("Employee name is "+ empName);
	 
	 }
	 
	 public static void main (String[] args){
	    Employee employee = new Employee();
        employee.display();		
	 }
}