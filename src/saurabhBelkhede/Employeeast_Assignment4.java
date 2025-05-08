package saurabhBelkhede;
// Assignment 4
class Employeeast {
	String fName = "Saurab";
	String lname = "belkhede";
	int empId = 0301;
	int managerId = 0000;
	String address = "abcdef";
	String phone = "8862021010";
	
	void updatePrimaryInfo(){
		fName = "Saurabh";
		lname = "Belkhede";
		empId = 309;
		managerId = 0101;
	}
	
	void updateSecondaryInfo(){
		address = "jklmn";
		phone = "9090909090";
	}
	
	void displayPrimaryInfo(){
		System.out.println("First Name: " + fName + "Last Name: " + lname + "Emp Id: " + empId + " Manager ID: " + managerId);
	}
	
	void displaySecondaryInfo(){
		System.out.println("Address: " + address + "Phone: " + phone);
	}
	
	void displayAllInfo(){
		System.out.println("First Name: " + fName );
		System.out.println("Last Name: " + lname );
		System.out.println("Emp Id: " + empId);
		System.out.println("Manager ID: " + managerId);
		System.out.println("Address: " + address);
		System.out.println("Phone: " + phone);


	}
	
	public static void main(String[] args) {
		Employeeast employee=new Employeeast();
		employee.updatePrimaryInfo();
		employee.updateSecondaryInfo();
		employee.displayPrimaryInfo();
		employee.displaySecondaryInfo();
		employee.displayAllInfo();
	}
	
	
	
}