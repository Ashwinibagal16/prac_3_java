package poojaJoshi;

class EmployeeDetail{
	
	String firstName, lastName,address, phoneNumber;
	int empId, managerId;
	
	void updatePrimaryInfo(){
		firstName = "Pooja";
		lastName = "Joshi";
		empId = 611;
		managerId = 134;
	}
	
	 void updateSecondaryInfo(){
		address = "Mhada towers , Pimpri";
		phoneNumber = "9856765432";
	 }
	 
	 void displayPrimaryInfo(){
		 System.out.println("Primary Information: ");
		 System.out.println("First name is : "+firstName);
		 System.out.println("Last name is : " +lastName);
		 System.out.println("employee Id is : " +empId);
		 System.out.println("Manager id is : "+managerId);
		 System.out.println("                            ");
	 }
	 
	 void displayOtherInfo(){
		System.out.println("Other information is : ");
		System.out.println("Address is: "+address);
		System.out.println("Phone Number is : "+phoneNumber);
		System.out.println("                            ");
	 }
	 
	 void displayAllInfo(){
		 System.out.println("Employee All information: ");
		System.out.println("First name is : "+firstName);
		System.out.println("Last name is : " +lastName);
		System.out.println("employee Id is : " +empId);
		System.out.println("Manager id is : "+managerId);;
		System.out.println("Address is: "+address);
		System.out.println("Phone Number is : "+phoneNumber);
		System.out.println("                            ");
	 }
	 
	 public static void main (String[] args){
		 EmployeeDetail empdetail = new EmployeeDetail();
			 empdetail.updatePrimaryInfo();
			 empdetail.updateSecondaryInfo();
			 empdetail.displayPrimaryInfo();
			 empdetail.displayOtherInfo();
			 empdetail.displayAllInfo();
		 }
}