package madhuriMalvi;
class Employee{
	String fName="Madhuri";
	String lName="Malvi";
	int empId = 123;
	
	void display(){
	    System.out.println(fName);
		System.out.println(lName);
		System.out.println(empId);
	}
    public static void main(String[] args){
	    Employee e = new Employee();
		e.display();
}
}