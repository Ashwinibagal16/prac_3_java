package rohanNaik;

class Student{

	String name = "Rohan";
	String lastName = "Naik";
	int employeeID = 14;
	
	void display(){
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(employeeID);
	}
	
	public static void main(String args[]){
		
		Student student = new Student();
		student.display();
	}
}