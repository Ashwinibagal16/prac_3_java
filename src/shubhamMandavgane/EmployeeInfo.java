package shubhamMandavgane;
class EmployeeInfo{
   String firstName, lastName;
   int empId, managerId;
   String address, phoneNumber;
   
   void updatePrimaryInfo(){
     firstName = "Shubham";
     lastName = "Mandavgane";
     empId = 121;
     managerId = 1001;
   }
    void updateSecondaryInfo(){
     address = "Pune";
     phoneNumber = "+91-9765463742";
   } 
	void displayPrimaryInfo(){
	 System.out.println("First Name is " + firstName);
	 System.out.println("Last Name is " + lastName);
	 System.out.println("Emp ID is " + empId);
	 System.out.println("Manager ID  is " + managerId);
	}
   
   void displayOtherInfo(){
     System.out.println("Address is " + address);
	 System.out.println("phone Number is " + phoneNumber);
   }
   
   void displayAllInfo(){
	 System.out.println("First Name is " + firstName);
	 System.out.println("Last Name is " + lastName);
	 System.out.println("Emp ID is " + empId);
	 System.out.println("Manager ID  is " + managerId);
	 System.out.println("Address is " + address);
	 System.out.println("phone Number is " + phoneNumber);
   }
   
    public static void main(String[] args){
	    EmployeeInfo employeeinfo = new EmployeeInfo();
		employeeinfo.updatePrimaryInfo();
		employeeinfo.updateSecondaryInfo();
		employeeinfo.displayPrimaryInfo();
		employeeinfo.displayOtherInfo();
		employeeinfo.displayAllInfo();
	}
   
}