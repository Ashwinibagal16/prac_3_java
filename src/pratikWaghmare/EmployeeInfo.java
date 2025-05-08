package pratikWaghmare;
class EmployeeInfo{
	
	String fname, lname, phnumber, address;
	int empId, mangerId;
	
	void updatePrimaryInfo(){
		fname = "Pratik";
		lname = "Waghmare";
		empId = 12345;
		mangerId = 67890;
	}
	void updateSecondaryInfo(){
		address = "Pimpri-Chinchwad";
		phnumber = "+91 9874561230";
	}
	void displayPrimaryInfo(){
		System.out.println("Employee's first name is "+ fname);
		System.out.println("Employee's last name is "+ lname);
		System.out.println("Employee's emplyoee id is "+ empId);
		System.out.println("Employee's manager id is "+ mangerId);
	}
	void displayOtherInfo(){
		System.out.println("Employee's address is "+ address);
		System.out.println("Employee's phone number is "+ phnumber);
	}
	void displayAllInfo(){
		System.out.println("Employee's first name is "+ fname);
		System.out.println("Employee's last name is "+ lname);
		System.out.println("Employee's emplyoee id is "+ empId);
		System.out.println("Employee's manager id is "+ mangerId);
		System.out.println("Employee's address is "+ address);
		System.out.println("Employee's phone number is "+ phnumber);
	}
	public static void main(String a[]){
		EmployeeInfo emplyoeeInfo = new EmployeeInfo();
		emplyoeeInfo.updatePrimaryInfo();
		emplyoeeInfo.updateSecondaryInfo();
		emplyoeeInfo.displayPrimaryInfo();
		emplyoeeInfo.displayOtherInfo();
		emplyoeeInfo.displayAllInfo();
	}

}