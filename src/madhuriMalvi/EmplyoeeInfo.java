/*Create a class called Employee having following instance variable.

firstName, lastName, empId(int), managerId (int), address (String), phoneNumber(String) ["+91-9765463742"]

create 5 methods.

1) updatePrimaryInfo() -> firstName, lastName, empId, managerId

2) updateSecondaryInfo() -> address, phoneNumber

3) displayPrimaryInfo() -> firstName, lastName, empId, managerId

4) displayOtherInfo() -> address, phoneNumber

5) displayAllInfo() -> firstName, lastName, empId, managerId, address, phoneNumber

main -> updatePrimaryInfo() -> updateSecondaryInfo() -> displayPrimaryInfo() -> displayOtherInfo() -> displayAllInfo()*/
package madhuriMalvi;
class EmployeeInfo{
	String firstName,lastName,address,phoneNumber= "+91-976543742";
	int empId,managerId;
	
	void updatePrimaryInfo(){
		firstName = "Madhuri";
		lastName = "Malvi";
		empId = 123;
		managerId = 2121;
	}
	void updateSecondaryInfo(){
		address = "A-12,Manhattan,Pride World";
		phoneNumber = "+91-976543742";
	}

	void displayPrimaryInfo(){
		System.out.println("Employee firstName is " + firstName);
		System.out.println("Employee lastName is " + lastName);
		System.out.println("Employee ID  is " + empId);
		System.out.println("Employee managerId is " + managerId);
		System.out.println("*****************************************");
	}
	void displayOtherInfo(){
		System.out.println("Employee address is " + address);
		System.out.println("Employee phoneNumber is " + phoneNumber);
		System.out.println("*****************************************");
	}
	void displayAllInfo(){
		System.out.println("Employee firstName is " + firstName);
		System.out.println("Employee lastName is " + lastName);
		System.out.println("Employee ID  is " + empId);
		System.out.println("Employee managerId is " + managerId);
		System.out.println("Employee address is " + address);
		System.out.println("Employee phoneNumber is " + phoneNumber);
	}
	
	public static void main(String[] args){
		EmployeeInfo employeeinfo = new EmployeeInfo();
		employeeinfo.updatePrimaryInfo();
		employeeinfo.updateSecondaryInfo();
		employeeinfo.displayPrimaryInfo();
		employeeinfo.displayOtherInfo();
		employeeinfo.displayAllInfo();
	}
}