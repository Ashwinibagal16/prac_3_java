package nitinSharma;
class Employee{
	
	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo(){
		firstName = "Nitin";
		lastName = "Sharma";
		empId = 205859;
		managerId = 252670;
	}
		
	void updateSecondaryInfo(){
		address = "Riesenbergstrasse Germany";
		phoneNumber = "+49-15510822084";
	}
		
	void displayPrimaryInfo(){
		System.out.println("Firstname of employee is: "+ firstName);
		System.out.println("lastname of employee is: "+ lastName);
		System.out.println("Employee's ID is: "+ empId);
		System.out.println("Manager's ID is: "+ managerId);
	}
	
	void displaySecondaryInfo(){
		System.out.println("Employee's address is: "+ address);
		System.out.println("Employee's phone number is: "+ phoneNumber);
	}
	
	void displayAllInfo(){
		System.out.println("Employee's name: "+ firstName + " "+ lastName);
		System.out.println("Employee's ID is: "+ empId);
		System.out.println("Manager's ID is: "+ managerId);
		System.out.println("Employee's address is: "+ address);
		System.out.println("Employee's phone number is: "+ phoneNumber);
		}
		
	public static void main(String[] args){
		Employee employee_1 = new Employee();
		employee_1.updatePrimaryInfo();
		employee_1.displayPrimaryInfo();
		
		Employee employee_2 = new Employee();
		employee_2.updateSecondaryInfo();
		employee_2.displaySecondaryInfo();
		
		Employee employee_3 = new Employee();
		employee_3.updatePrimaryInfo();
		employee_3.updateSecondaryInfo();
		employee_3.displayAllInfo();
	}
}