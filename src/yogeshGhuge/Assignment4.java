package yogeshGhuge;

class Assignment4 {

	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phoneNumber;
	
	void updatePrimaryinfo(){
		
		firstName = "Yogesh";
		lastName = "Ghuge";
		empId = 2468;
		managerId = 36912;	
	}

	void secondaryinfo(){
		
		address = "Pune";
		phoneNumber = "+91-567983";
	}
	
	void displayPrimary(){
	
		System.out.println("Employee firstName is :" + firstName);
		System.out.println("Employee lastName is : " + lastName);
		System.out.println("Employee id is:" + empId);
		System.out.print("manager id is:" + managerId);
	}
	
	void displayOtherinfor (){
	
		System.out.println("Current address is :" + address );
		System.out.println("Updated phonenumber is :" + phoneNumber );
	}
	void allInfo (){
		System.out.println("Employee firstName is :" + firstName);
		System.out.println("Employee lastName is : " + lastName);
		System.out.println("Employee id is:" + empId);
		System.out.print("manager id is:" + managerId);
		System.out.println("Current address is :" + address );
		System.out.println("Updated phonenumber is :" + phoneNumber );
		
	}
	
	public static void main(String [] args){
		Assignment4 empinfo = new Assignment4();
		empinfo.updatePrimaryinfo();
		empinfo.secondaryinfo();
		empinfo.displayPrimary();
		empinfo.displayOtherinfor();
		empinfo.allInfo();
	}
}