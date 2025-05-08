package snehalShinde;

class EmployeeAllInfo{

	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phoneNo;
	
	
	void updatePrimaryInfo(){
		firstName = "Snehal";
		lastName = "Shinde";
		empId = 1234;
		managerId = 6789;
	}
	
	void updateSecondaryInfo(){
		address = "Swargate, Pune-411043";
		phoneNo = "+91-1234567890";
	} 
	
	void displayPrimaryInfo(){
		System.out.println("Employee's Primary Information -->");
		System.out.println();
		System.out.println("Employee's first name : " + firstName);
		System.out.println("Employee's last name : " + lastName);
		System.out.println("Employee's ID : " + empId);
		System.out.println("Manager's ID : " + managerId);
		System.out.println("-------------------------------");
	}
	
	void displayOtherInfo(){
		System.out.println("Employee's Other Information -->");
		System.out.println();
		System.out.println("Employee's address : " + address);
		System.out.println("Employee's phone number : " + phoneNo);
		System.out.println("-------------------------------");
	}
	
	void displayAllInfo(){
		System.out.println("Employee's All Information -->");	
		System.out.println();		
		System.out.println("Employee's first name : " + firstName);
		System.out.println("Employee's last name : " + lastName);
		System.out.println("Employee's ID : " + empId);
		System.out.println("Manager's ID : " + managerId);
		System.out.println("Employee's address : " + address);
		System.out.println("Employee's phone number : " + phoneNo);
	}	
	
	public static void main(String[] args){
		EmployeeAllInfo employeeAllInfo = new EmployeeAllInfo();
		employeeAllInfo.updatePrimaryInfo();
		employeeAllInfo.updateSecondaryInfo();
		employeeAllInfo.displayPrimaryInfo();
		employeeAllInfo.displayOtherInfo();
		employeeAllInfo.displayAllInfo();
	}
}
	
	
	
	
	