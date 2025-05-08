package najneenMalgave;

class EmployeeDetails{
	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo(){
		firstName = "Inaaya";
		lastName = "Kavthekar";
		empId = 7;
		managerId = 1;
	}
	
	void updateSecondaryInfo(){
		address = "I-205, Sarang, Nanded City";
		phoneNumber = "+91-1234567890";
	}
	
	void displayPrimaryInfo(){
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(empId);
		System.out.println(managerId);
	}
	
	void displayOtherInfo(){
		System.out.println(address);
		System.out.println(phoneNumber);
	}
	
	void displayAllInfo(){
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(empId);
		System.out.println(managerId);
		System.out.println(address);
		System.out.println(phoneNumber);
	}
			
	public static void main (String[] args){
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.updatePrimaryInfo();
		employeeDetails.updateSecondaryInfo();
		employeeDetails.displayPrimaryInfo();
		employeeDetails.displayOtherInfo();
		employeeDetails.displayAllInfo();
	}
}	