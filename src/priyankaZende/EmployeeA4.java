/*Create a class called Employee having following instance variable.

firstName, lastName, empId (int), managerId (int), address (String), phoneNumber(String) ["+91-9765463742"]

create 5 methods.

1) updatePrimaryInfo() -> firstName, lastName, empId, managerId

2) updateSecondaryInfo() -> address, phoneNumber

3) displayPrimaryInfo() -> firstName, lastName, empId, managerId

4) displayOtherInfo() -> address, phoneNumber

5) displayAllInfo() -> firstName, lastName, empId, managerId, address, phoneNumber

main -> updatePrimaryInfo() -> updateSecondaryInfo() -> displayPrimaryInfo() -> displayOtherInfo() -> displayAllInfo()*/
package priyankaZende;
class EmployeeA4{

	String firstName = "Priyanka";
	String lastName = "Zende";
	int empId = 123;
	int managerId = 555;
	String address = "Baner";
	String phoneNumber = "+91-9765463742";
	
	void updatePrimaryInfo(){
		firstName = "Prajakta";
		lastName = "Shinde";
		empId = 444;
		managerId = 777;
	}

	void updateSecondaryInfo(){
		address = "Hinjewadi";
		phoneNumber = "+91-9763568413";
	}

	void displayPrimaryInfo(){
		System.out.println("firstName: " + firstName);
		System.out.println("lastName: " + lastName);
		System.out.println("empId: " + empId);
		System.out.println("managerId: " + managerId);
	}	
	
	void displayOtherInfo(){
		System.out.println("address: " + address);
		System.out.println("phoneNumber: " + phoneNumber);
	}
	
	void displayAllInfo(){
		System.out.println("firstName: " + firstName);
		System.out.println("lastName: " + lastName);
		System.out.println("empId: " + empId);
		System.out.println("managerId: " + managerId);
		System.out.println("address: " + address);
		System.out.println("phoneNumber: " + phoneNumber);
	}
	
	public static void main(String[] args){
		EmployeeA4 employeeA4 = new EmployeeA4();
		employeeA4.updatePrimaryInfo();
		employeeA4.updateSecondaryInfo();
		employeeA4.displayPrimaryInfo();
		employeeA4.displayOtherInfo();
		employeeA4.displayAllInfo();
	}
}	
		
		
	
