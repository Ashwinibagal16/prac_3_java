package anushreePatra;

class EmployeeDetail{
	String firstName = "Anu";
	String lastName = "Patra";
	int empId = 7890;
	int managerId = 1212;
	String address = "Hinjewadi";
	String phoneNumber = "+91-9765463742";
	
	void updatePrimaryInfo(){
		String firstName = "Gigi";
		String lastName = "Tail";
		int empId = 7790;
		int managerId = 9087;
		System.out.println("Employee First Name is " + firstName);
		System.out.println("Employee Last Name is " + lastName);
		System.out.println("Employee empId is " + empId);
		System.out.println("Employee managerId is " + managerId);
	}
	
	void updateSecondaryInfo(){
		String address = "Wagoli";
		String phoneNumber = "+91-9000890999";
		System.out.println("Employee address is " + address);
		System.out.println("Employee phoneNumber is " + phoneNumber);		
	}
	
	void displayPrimaryInfo(){
		String firstName = "Riya";
		String lastName = "Sharma";
		int empId = 1234;
		int managerId = 8808;
		System.out.println("Employee First Name is " + firstName);
		System.out.println("Employee Last Name is " + lastName);
		System.out.println("Employee empId is " + empId);
		System.out.println("Employee managerId is " + managerId);		
	}
	
	void displayOtherInfo(){
		String address = "Wakad";
		String phoneNumber = "+91-8888889090";
		System.out.println("Employee address is " + address);
		System.out.println("Employee phoneNumber is " + phoneNumber);
	}
	
	void displayAllInfo(){
		String firstName = "Tanu";
		String lastName = "Patra";
		int empId = 6677;
		int managerId = 2222;
		String address = "Diu";
		String phoneNumber = "+91-9765468888";
		System.out.println("Employee First Name is " + firstName);
		System.out.println("Employee Last Name is " + lastName);
		System.out.println("Employee empId is " + empId);
		System.out.println("Employee managerId is " + managerId);
		System.out.println("Employee address is " + address);
		System.out.println("Employee phoneNumber is " + phoneNumber);	
	}
	
	public static void main(String[] args){
		EmployeeDetail employeeDetail = new EmployeeDetail();
		employeeDetail.updatePrimaryInfo();
		employeeDetail.updateSecondaryInfo();
		employeeDetail.displayPrimaryInfo();
		employeeDetail.displayOtherInfo();
		employeeDetail.displayAllInfo();
	
	}	
		}		