package aniketBalsaraf;

class Employee{
	
	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo(){
		firstName = "Aniket";
		lastName = "Balsaraf";
		empId = 11;
		managerId = 123;
	}
	
	void updateSecondaryInfo(){
		address = "Hinjewadi Pune";
		phoneNumber = "1234567890";	
	}
	
	void displayPrimaryInfo(){
		System.out.println("/*****Display Primary Info********/");
		System.out.println("Employee First Name is " + firstName);
		System.out.println("Employee Last Name is " + lastName);
		System.out.println("Employee Id is " + empId);
		System.out.println("Manager Id is " + managerId);
	}
	
	void displayOtherInfo(){
		System.out.println("/*****Display Other Info********/");
		System.out.println("Employee Address is " + address);
		System.out.println("Employee Phone Number is " + phoneNumber);
	}
	
	void displayAllInfo(){
		System.out.println("/*****Display All Info********/");
		System.out.println("Employee First Name is " + firstName);
		System.out.println("Employee Last Name is " + lastName);
		System.out.println("Employee Id is " + empId);
		System.out.println("Manager Id is " + managerId);
		System.out.println("Employee Address is " + address);
		System.out.println("Employee Phone Number is " + phoneNumber);
	}
	
	public static void main(String[] args){
		Employee employee = new Employee();
		employee.updatePrimaryInfo();
		employee.updateSecondaryInfo();
		employee.displayPrimaryInfo();
		employee.displayOtherInfo();
		employee.displayAllInfo();
	}
	
	
}