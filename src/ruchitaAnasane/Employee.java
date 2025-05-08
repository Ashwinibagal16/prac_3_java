package ruchitaAnasane;

class Employee{
	
	String firstName ="Ruchita";
	String lastName ="Anasane";
	int empId =121;
	
	void display(){
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(empId);
	}

	public static void main(String[] args){
		Employee emp = new Employee();
		emp.display();
	
	}
}
