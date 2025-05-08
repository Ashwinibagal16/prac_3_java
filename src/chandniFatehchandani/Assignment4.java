package chandniFatehchandani;

/* Assignment 4 : Create a class called Employee having following instance variable.

firstName, lastName, empId (int), managerId (int), address (String), phoneNumber(String) ["+91-9765463742"]

create 5 methods.

1) updatePrimaryInfo() -> firstName, lastName, empId, managerId

2) updateSecondaryInfo() -> address, phoneNumber

3) displayPrimaryInfo() -> firstName, lastName, empId, managerId

4) displayOtherInfo() -> address, phoneNumber

5) displayAllInfo() -> firstName, lastName, empId, managerId, address, phoneNumber

main -> updatePrimaryInfo() -> updateSecondaryInfo() -> displayPrimaryInfo() -> displayOtherInfo() -> displayAllInfo()*/

class Assignment4{
	String firstName;
	String lastName;
	int empID;
	int managerId;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo(){
		firstName = "Chandani";
		lastName = "Fatehchandani";
		empID = 123;
		managerId = 456;
	}
	
	void updateSecondaryInfo(){
		address = "Hiranandani, Mumbai - 400020";
		phoneNumber = "+91-9765463742";
	}
	
	void displayOtherInfo(){
		System.out.println("Address of the employee is " + address + " and phone number of that employee is " + phoneNumber );
	}
	
	void displayAllInfo(){
		System.out.println("First Name and last name of the employee is " + firstName + " " + lastName);
		System.out.println("Emp ID and manager ID of the employee is " + empID + managerId);
		System.out.println("Address of the employee is " + address + " and phone number of that employee is " + phoneNumber );
	}
	
	public static void main(String[] args){
		Assignment4 E = new Assignment4();
		E.updatePrimaryInfo();
		E.updateSecondaryInfo();
		E.displayOtherInfo();
		E.displayAllInfo();
	}
}