//Assignment 4
package jeetHingrajiya;
class Employee1{
	
	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phoneNumber;	
	
	void updatePrimaryInfo(){
		firstName= "Jeet";
		lastName= "Hingarajia";
		empId = 24;
		managerId= 04;
	}
	
	void updateSecondaryInfo(){
		address = "Bhayavadar,Rajkot,GJ 360450";
		phoneNumber = "+91-9313840343";
	}
	
	void displayPrimaryInfo(){
		System.out.println("===============================");
		System.out.println("First Name is : " + firstName);
		System.out.println("Last Name is : " + lastName);
		System.out.println("Employee Id  is : " + empId);
		System.out.println("Manager ID is : " + managerId);
	}
	
	void displayOtherInfo(){
		System.out.println("===============================");
		System.out.println("Adress  is : " + address);
		System.out.println("PhoneNumber is : " + phoneNumber);
	}
	
	void displayAllInfo(){
		System.out.println("===============================");
		System.out.println("First Name is : " + firstName);
		System.out.println("Last Name is : " + lastName);
		System.out.println("Employee Id  is : " + empId);
		System.out.println("Manager Id is : " + managerId);
		System.out.println("Adress  is : " + address);
		System.out.println("PhoneNumber is : " + phoneNumber);
	}
	
	public static void main(String[]args){
		Employee1 employee1 = new Employee1();
		employee1.updatePrimaryInfo();
		employee1.updateSecondaryInfo();
		employee1.displayPrimaryInfo();
		employee1.displayOtherInfo();
		employee1.displayAllInfo();
	}
}