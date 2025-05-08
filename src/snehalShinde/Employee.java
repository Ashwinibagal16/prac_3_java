package snehalShinde;

class Employee{
	String fname="Snehal";
	String lname="Shinde";
	int empid=0001;

	void display(){
		System.out.println("Employee first name is: " + fname);
		System.out.println("Employee last name is: " + lname);
		System.out.println("Employee ID is: "  + empid);
	}
	
	public static void main(String[] args){
		Employee x = new Employee();
		x.display();	
	}		
}