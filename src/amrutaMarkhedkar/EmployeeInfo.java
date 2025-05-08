package amrutaMarkhedkar;

class EmployeeInfo{

	String firstName, lastName, address, phoneNumber;
	int empId, managerId;
	
	void updatePrimaryInfo(){
		firstName = "Amruta";
		lastName = "Markhedkar";
		empId = 12345;
		managerId = 54321;
	} 

	void updateSecondaryInfo(){
		address = "Chinchwad";
		phoneNumber = "+91-9765463742";
	} 

	void displayPrimaryInfo(){
		System.out.println("Employee First name is : "+firstName);
		System.out.println("Employee Last name is : "+lastName);
		System.out.println("Employee emp id is : "+empId);
		System.out.println("Employee manager id is : "+managerId);
	}

	void displayOtherInfo(){
		System.out.println("**********************");
		System.out.println("Employee address is : "+address);
		System.out.println("Employee phoneNumber is : "+phoneNumber);
	} 

	void displayAllInfo(){
		System.out.println("**********************");
		System.out.println("Employee First name is : "+firstName);
		System.out.println("Employee Last name is : "+lastName);
		System.out.println("Employee emp id is : "+empId);
		System.out.println("Employee manager id is : "+managerId);
		System.out.println("Employee address is : "+address);
		System.out.println("Employee phoneNumber is : "+phoneNumber);		
	}
	
	public static void main(String [] args){
		EmployeeInfo employeeInfo = new EmployeeInfo();
		employeeInfo.updatePrimaryInfo();
		employeeInfo.updateSecondaryInfo();
		employeeInfo.displayPrimaryInfo();
		employeeInfo.displayOtherInfo();
		employeeInfo.displayAllInfo();		
	}
}