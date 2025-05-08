package suchetaGhogare;

class EmpDetails{
	int empId;
	int managerId;
	String firstName;
	String lastName;
	String address;
	String phoneNumber;

	void updatePrimaryInfo(){
		firstName = "Sucheta";
		lastName = "Ghogare";
		empId = 100;
		managerId = 9;
	}

	void updateSecondaryInfo(){
		address ="Pune";
		phoneNumber ="+91-9765463742";
	}

	void displayPrimaryInfo(){
		System.out.println("PRIMARY INFO -");
		System.out.println("Employee's First name is: " +firstName);
		System.out.println("Employee's Last name is : " +lastName);
		System.out.println("Emp ID is: "+empId);
		System.out.println("Employee's Manager ID is: "+managerId);
		System.out.println("============================================");
	}

	void displaySecondaryInfo(){
		System.out.println("SECONDARY INFO -");
		System.out.println("Employee's address is: "+address);
		System.out.println("Employee's phone number is: "+phoneNumber);
		System.out.println("============================================");
	}

	void displayAllInfo(){
		System.out.println("ENTIRE INFO -");
		System.out.println("Employee's First name is: " +firstName);
		System.out.println("Employee's Last name is : " +lastName);
		System.out.println("Emp ID is: "+empId);
		System.out.println("Employee's Manager ID is: "+managerId);
		System.out.println("Employee's address is: "+address);
		System.out.println("Employee's phone number is: "+phoneNumber);
		//System.out.println("============================================");
	}

	public static void main(String[] args){
		EmpDetails empDetails = new EmpDetails();
		empDetails.updatePrimaryInfo();
		empDetails.updateSecondaryInfo();
		empDetails.displayPrimaryInfo();
		empDetails.displaySecondaryInfo();
		empDetails.displayAllInfo();
	}
}