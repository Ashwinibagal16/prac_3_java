package rahulAlagoudar;

class Employee1{
	String fName;
	String lName;
	int empid;
	int managerid;
	String addr;
	String phNo;
	
	void primaryinfo(){
		fName="Rahul";
		lName="Alagoudar";
		empid=112233;
		managerid=2323;
	}
	
	void secondaryinfo(){
		addr="A/P Hyderabad";
		phNo="+91-9595959595";
	}
	
	void dispPriInfo(){
		System.out.println("First name is:"+fName);
		System.out.println("Last name is:"+lName);
		System.out.println("Employee id is:"+empid);
		System.out.println("Manager's id is:"+managerid);
	}
	
	void dispSecInfo(){
		System.out.println("Address is:"+addr);
		System.out.println("Phone no is:"+phNo);
	}
	
	public static void main(String[] args){
		Employee1 employee1 = new Employee1();
		employee1.primaryinfo();
		employee1.secondaryinfo();
		employee1.dispPriInfo();
		employee1.dispSecInfo();
	}
}
