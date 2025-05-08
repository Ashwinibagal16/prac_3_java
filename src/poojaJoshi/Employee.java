package poojaJoshi;

class Employee{

	String firstName="Pooja";
	String lastName="Joshi";
	int empId=1212;
	String address="Pune";
	
	void display(){
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(empId);
		System.out.println(address);
	}
	
	void moreDetails(){
		//String address="Pune1";
		System.out.println(address);
	}
	
	
	public static void main(String[] args){
		Employee emp = new Employee();
		//emp.moreDetails();
		emp.display();
	}
	}
	