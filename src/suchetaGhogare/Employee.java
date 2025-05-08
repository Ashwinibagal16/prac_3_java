package suchetaGhogare;

class EMPLOYEE {
	String firstName = "Sucheta";
	String lastName = "Ghogare";
	int empId = 123;

	void displayInfo(){
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(empId);
	}

	public static void main(String[] args){
		EMPLOYEE e = new EMPLOYEE();
		e.displayInfo();
	}
}