package vivekRahate;
class EmployeeInfo{
	String firstName;
	String lastName;
	int empID;
	int managerID;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo(){
		firstName = "Vivek";
		lastName = "Rahate";
		empID = 101;
		managerID = 1001;
	}
	
	void updateSecondaryInfo(){
		address = "Worli";
		phoneNumber = "91-1234567890";
	}
	
	void displayPrimaryInfo(){
		System.out.println("Display Primary info of Employee");
		System.out.println("Employee Name is " + firstName + " " + lastName + " and Employee ID is " + empID + " and his Manager ID is " + managerID);	
	}
	
	void displayOtherInfo(){
		System.out.println("Display other info of Employee");
		System.out.println("Address of Employee is " + address + " and phoneNumber is " + phoneNumber);	
	}
	
	void displayAllInfo(){
		System.out.println("*************************************");
		System.out.println("Display All information of Employee");
		displayPrimaryInfo();
		displayOtherInfo();
	}
	
	public static void main(String args[]){
		EmployeeInfo employeeinfo = new EmployeeInfo();
		employeeinfo.updatePrimaryInfo();
		employeeinfo.updateSecondaryInfo();
		employeeinfo.displayPrimaryInfo();
		employeeinfo.displayOtherInfo();
		employeeinfo.displayAllInfo();	
	}
}