package krupa;

class Employee {

  String firstName="krupa";
  String lastName="Vadalia";
  int empId=101;
 
  void display() {
    System.out.println("Employee First Name is "+firstName);
    System.out.println("Employee Last Name is "+lastName);
	System.out.println("Employee Id is "+empId);
  }
  
  public static void main(String[] args) {
	Employee emp = new Employee();
	emp.display();
  }
 
}