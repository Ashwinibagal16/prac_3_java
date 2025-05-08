//A-4
package nishmita;
class Employee{
	int empId;
	String firstName;
	String lastName;
	int managerId;
	String address;
	String phoneNumber;

	void updatePrimaryInfo(){
		empId=722;
		firstName="Nishmitha";
		lastName="Kullampady";
		managerId=752;
	}

	void updateSecondaryInfo(){
		address="Pune";
		phoneNumber="917349722752";
	}

	void displayPrimaryInfo(){
		System.out.println("Employee First Name: " + firstName);
		System.out.println("Employee Last Name: " + lastName);
		System.out.println("Employee EmpId: " + empId);
		System.out.println("Manager Id: " + managerId);
	}

	void displayOtherInfo(){
		System.out.println("Employee Address: " + address);
		System.out.println("Employee PhoneNumber: " + phoneNumber);
	}

	void displayAllInfo(){
		System.out.println("Employee First Name: " + firstName);
		System.out.println("Employee Last Name: " + lastName);
		System.out.println("Employee EmpId: " + empId);
		System.out.println("Manager Id: " + managerId);
		System.out.println("Employee Address: " + address);
		System.out.println("Employee PhoneNumber: " + phoneNumber);
	}

	public static void main(String[] args){
		Employee employee= new Employee();
		employee.updatePrimaryInfo();
		employee.updateSecondaryInfo();
		employee.displayPrimaryInfo();
		employee.displayOtherInfo();
		employee.displayAllInfo();
	}
}