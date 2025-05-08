package umakantSahani;

class EmployeeInfo{
	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo(){
		firstName = "Umakant";
		lastName = "Sahani";
		empId = 402;
		managerId = 2806;
	}
	
	void updateSecondaryInfo(){
		address = "101/5A, Brahma Samaj Road, Kolkata-700060";
		phoneNumber = "+91-7003092030";
	}
	
	void displayPrimaryInfo(){
		System.out.println("Employee's First Name is: " + firstName);
		System.out.println("Employee's last Name is: " + lastName);
		System.out.println("Employee's Employee Id is: " + empId);
		System.out.println("Employee's Manager Id is: " + managerId);
	}
	
	void displayOtherInfo(){
		System.out.println("Employee's address is: " + address);
		System.out.println("Employee's phoneNumber is: " + phoneNumber);
	}
	
	void displayAllInfo(){
		System.out.println("Employee's First Name is: " + firstName);
		System.out.println("Employee's last Name is: " + lastName);
		System.out.println("Employee's Employee Id is: " + empId);
		System.out.println("Employee's Manager Id is: " + managerId);
		System.out.println("Employee's address is: " + address);
		System.out.println("Employee's phoneNumber is: " + phoneNumber);
	}
	
	public static void main(String[] args){
		EmployeeInfo employeeInfo = new EmployeeInfo();
		employeeInfo.updatePrimaryInfo();
		employeeInfo.updateSecondaryInfo();
		employeeInfo.displayPrimaryInfo();
		employeeInfo.displayOtherInfo();
		employeeInfo.displayAllInfo();
	}
}