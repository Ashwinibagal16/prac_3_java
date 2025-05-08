package ojaswini;
class EmployeeNew{
  String firstName;
  String lastName;
  int empId;
  int managerId;
  String address;
  String phoneNumber;
  
  void updatePrimaryInfo(){
     firstName ="vini";
	 lastName ="kumari";
	 empId =234;
	 managerId =345;
  }
  
  void updateSecondaryInfo(){
     address ="kolkata";
	 phoneNumber ="+91 8789439107";
  }
  
  void displayPrimaryInfo(){
     System.out.println("employee first name is "+ firstName);
	 System.out.println("employee last name is "+ lastName);
	 System.out.println("employee id is "+ empId);
	 System.out.println("manager id is "+ managerId);
  }
  
  void displayOtherInfo(){
     System.out.println("employee address is "+ address);
	 System.out.println("employee phone number is "+ phoneNumber);
  }
  
  public static void main(String[] args){
     EmployeeNew e1 = new EmployeeNew();
	 e1.updatePrimaryInfo();
	 e1.displayPrimaryInfo();
	 e1.updateSecondaryInfo();
	 e1.displayOtherInfo();
  }
}