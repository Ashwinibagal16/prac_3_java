package vaibhavPatil;


class Emp1{
	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo(){
		firstName="vaibhav";
		lastName="Patil";
		empId=1234;
		managerId=9874;
	}
	
	void updateSecondaryInfo(){
		address="Shiv Colony, Jalgaon";
		phoneNumber="9420946553";
	}
	
	void displayPrimaryInfo(){
		System.out.println("First name is : " + firstName);
		System.out.println("Last name is : " + lastName);
		System.out.println("Employee Id is : " + empId);
		System.out.println("manager Id is : " + managerId);
		System.out.println("manager Id is : " + managerId);
		System.out.println();
		
	}
	
	void displayOtherInfo(){
		System.out.println("Adress is : " + address);
		System.out.println("Phone no is : " + phoneNumber);
		System.out.println();

	}
	
	void displayAllInfo(){
		System.out.println("First name is : " + firstName);
		System.out.println("Last name is : " + lastName);
		System.out.println("Employee Id is : " + empId);
		System.out.println("manager Id is : " + managerId);
		System.out.println("Adress is : " + address);
		System.out.println("Phone no is : " + phoneNumber);
	}
	
	public static void main(String[] args){
		Emp1 emp1 = new Emp1();
		emp1.updatePrimaryInfo();
		emp1.updateSecondaryInfo();
		emp1.displayPrimaryInfo();
		emp1.displayOtherInfo();
		emp1.displayAllInfo();
	}
}