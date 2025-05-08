package shrutiPundikar;

class Employee1{
	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo(){
		firstName = "Shruti";
		lastName = "Pundikar";
		empId = 610;
		managerId = 111;
	}
	
	void updateSecondaryInfo(){
		address = "Pune";
		phoneNumber = "+91-9876543210";
	}
	
	void displayPrimaryInfo(){
		System.out.println("First Name of Employee is " + firstName);
		System.out.println("Last Name of Employee is " + lastName);
		System.out.println("Employee Id is " + empId);
		System.out.println("Manager Id is " + managerId);
	}
	
	void displayOtherInfo(){
		System.out.println("                ");
		System.out.println("Address of Employee is " + address);
		System.out.println("Phone Number of Employee is " + phoneNumber);
	}
	
	void displayAllInfo(){
		System.out.println("                ");
		System.out.println("First Name of Employee is " + firstName);
		System.out.println("Last Name of Employee is " + lastName);
		System.out.println("Employee Id is " + empId);
		System.out.println("Manager Id is " + managerId);
		System.out.println("Address of Employee is " + address);
		System.out.println("Phone Number of Employee is " + phoneNumber);
	}
	
	public static void main(String[] args){
		Employee1 employee1 = new Employee1();
		employee1.updatePrimaryInfo();
		employee1.updateSecondaryInfo();
		employee1.displayPrimaryInfo();
		employee1.displayOtherInfo();
		employee1.displayAllInfo();
	}
}