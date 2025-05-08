package vivekDhole;

class Assignment4 {

	String firstName;
	String lastName;
	int empId; 
	int managerID;
	String address;
	String phoneNumber;

	void updatePrimaryInfo() {
		firstName = "Vivek";
		lastName = "Dhole";
		empId = 27;
		managerID = 2709;
	}

	void updateSecondaryInfo() {
		address = "PCMC";
		phoneNumber = "+91-9011918689";
	}

	void displayPrimaryInfo() {
		System.out.println("First name is " + firstName);
		System.out.println("Last name is " + lastName);
		System.out.println("Employee Id is " + empId);
		System.out.println("Manager Id is " + managerID);
	}

	void displayOtherInfo() {
		System.out.println("Address is " + address);
		System.out.println("Phone number is " + phoneNumber);
	}

	void displayAllInfo() {
		System.out.println("First name is " + firstName);
		System.out.println("Last name is " + lastName);
		System.out.println("Employee Id is " + empId);
		System.out.println("Manager Id is " + managerID);
		System.out.println("Address is " + address);
		System.out.println("Phone number is " + phoneNumber);
	}

	public static void main(String[] args) {
		Assignment4 emp27 = new Assignment4();
		emp27.updatePrimaryInfo();
		emp27.updateSecondaryInfo();
		emp27.displayPrimaryInfo();
		emp27.displayOtherInfo();
		emp27.displayAllInfo();
	}












}