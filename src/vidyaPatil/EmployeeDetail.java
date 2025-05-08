package vidyaPatil;

class EmployeeDetail{
	
	int empId;
	String empFirstName;
	String empLastName;
	int empManagerId;
	String empAddress;
	String empPhoneNo;
	
	void updatePrimaryInfo(){
		empId = 25171;
		empFirstName = "Vidya";
		empLastName = "Patil";
		empManagerId = 5111;
	}
	
	void updateSecondaryInfo(){
		empAddress = "Pimple Saudagar";
		empPhoneNo = "+91-9860507569";
	}
	
	void displayPrimaryInfo(){
		System.out.println("****Employee Primary Info****");
		System.out.println("Employee Id is : " + empId);
		System.out.println("Employee First Name is : " + empFirstName);
		System.out.println("Employee Last Name is : " + empLastName);
		System.out.println("Employee ManagerId is : " + empManagerId);	
	}
	
	void displayOtherInfo(){
		System.out.println("****Employee Secondary Info****");
		System.out.println("Employee address is : " + empAddress);
		System.out.println("Employee Phone No is : " + empPhoneNo);
	}
	
	void displayAllInfo(){
		System.out.println("****Employee All Info****");
		System.out.println("Employee Id is : " + empId);
		System.out.println("Employee First Name is : " + empFirstName);
		System.out.println("Employee Last Name is : " + empLastName);
		System.out.println("Employee ManagerId is : " + empManagerId);
		System.out.println("Employee address is : " + empAddress);
		System.out.println("Employee Phone No is : " + empPhoneNo);
	}
	
	public static void main(String[] args){
		EmployeeDetail employeeDetail = new EmployeeDetail();
		employeeDetail.updatePrimaryInfo();
		employeeDetail.updateSecondaryInfo();
		employeeDetail.displayPrimaryInfo();
		employeeDetail.displayOtherInfo();
		employeeDetail.displayAllInfo();
	}
}