
package omkarBhujbal;
class Employee1{
	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phoneNumber;
	
	void  updatePrimaryInfo(){
		firstName = "Omkar";
		lastName =  "Bhujbal";
		empId = empId + 121;
		managerId = managerId + 212;
	}
	
	void updateSecondaryInfo(){
		address = "Pune";
		phoneNumber ="+91-9960641850";
	}
	
	void displayPrimaryInfo(){
		System.out.println("Firstname is : " + firstName);  
		System.out.println("LastName is : " + lastName);  
        System.out.println("Employee Id is : " + empId);  
		System.out.println("Manager Id is : " + managerId);      	
	}
	
	void displayOtherInfo(){
		System.out.println("Address  is : " + address);   
		System.out.println("Phone Number is :" + phoneNumber);
	}
	
	void displayAllInfo(){
		System.out.println("Firstname is : " + firstName);  
		System.out.println("LastName is : " + lastName);  
        System.out.println("Employee Id is : " + empId);  
		System.out.println("Manager Id is : " + managerId);  
		System.out.println("Address  is : " + address);  
		System.out.println("Phone Number Id is : " + phoneNumber);
	}
	
	public static void main(String[] args){
		Employee1 emp = new Employee1();
		emp.updatePrimaryInfo();
		emp.updateSecondaryInfo();
		emp.displayPrimaryInfo();
		emp.displayOtherInfo();
		emp.displayAllInfo();
	}
}