//Assignment-4
package pankajMiniyar;
class EmployeeDetail{
	int empId;
	String firstName;
	String lastName;
	int managerId;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo(){
		empId=5;
		firstName="Pankaj";
		lastName="Miniyar";
		managerId=11;
	}
	
	void updateSecondaryInfo(){
		address="Pune";
		phoneNumber="+91-9404961834";
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
		EmployeeDetail employeeDetail= new EmployeeDetail();
		employeeDetail.updatePrimaryInfo();
		employeeDetail.updateSecondaryInfo();
		employeeDetail.displayPrimaryInfo();
		employeeDetail.displayOtherInfo();
		employeeDetail.displayAllInfo();
	}
}