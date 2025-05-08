package harshMandhana;

class EmployeeDetail
{
	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo()
	{
		firstName = "Harsh";
		lastName = "M";
		empId = 310;
		managerId = 839;
	}
	
	void updateSecondaryInfo()
	{
		address = "Magarpatta";
		phoneNumber = "+91-9876543210";
	}
	
	void displayPrimaryInfo()
	{
		System.out.println("First Name of employee is : "+firstName);
		System.out.println("Last Name of employee is : "+lastName);
		System.out.println("Employee ID of employee is : "+empId);
		System.out.println("Manager ID of employee is : "+managerId);
		System.out.println();
	}
	
	void displaySecondaryInfo()
	{
		System.out.println("Address of employee is : "+address);
		System.out.println("Phone number of employee is : "+phoneNumber);
		System.out.println();
	}
	
	void displayAllInfo()
	{
		System.out.println("All information of Employee is :");
		displayPrimaryInfo();
		displaySecondaryInfo();
	}
	
	public static void main(String args[])
	{
		EmployeeDetail employeeDetail = new EmployeeDetail();
		employeeDetail.updatePrimaryInfo();
		employeeDetail.updateSecondaryInfo();
		employeeDetail.displayPrimaryInfo();
		employeeDetail.displaySecondaryInfo();
		employeeDetail.displayAllInfo();
	}
}