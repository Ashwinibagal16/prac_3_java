/* Assignment - 4 : 22nd April'25

Create a class called Employee having following instance variable.

firstName, lastName, empId (int), managerId (int), address (String), phoneNumber(String) ["+91-9765463742"]

create 5 methods.

1) updatePrimaryInfo() -> firstName, lastName, empId, managerId

2) updateSecondaryInfo() -> address, phoneNumber

3) displayPrimaryInfo() -> firstName, lastName, empId, managerId

4) displayOtherInfo() -> address, phoneNumber

5) displayAllInfo() -> firstName, lastName, empId, managerId, address, phoneNumber

main -> updatePrimaryInfo() -> updateSecondaryInfo() -> displayPrimaryInfo() -> displayOtherInfo() -> displayAllInfo()

 */
 
package pranitaPurnik;

class Assignment4{
	 String firstName;
	 String lastName;
	 int empId;
	 int managerId;
	 String address;
	 String phoneNumber;
	 
	 void updatePrimaryInfo(){
		 firstName="Pranita";
		 lastName="Puranik";
		 empId = 545185;
		 managerId= 1234;
	 }
	 
	 void updateSecondaryInfo(){
		 address="ABC,Hogwartz colony";
		 phoneNumber="+91-9765463742";
	 }
	 
	 void displayPrimaryInfo(){
		 System.out.println("Employee Primary Details are:"+firstName +":"+lastName+":"+empId+ ":" +managerId );
	 }
	 
	 void displayOtherInfo(){
		 System.out.println("Employee address is :-"+address);
		 System.out.println("Employee phonenumebr is :-"+phoneNumber);	 
	 }
	 
	 void displayAllInfo(){
		 System.out.println("All information of employee is as follows:-"+firstName +":"+lastName+":"+empId+":"+managerId+":"+address+":"+phoneNumber);
	 }
	 
	 public static void main (String[] args){
			Assignment4 assignment4 = new Assignment4();
			assignment4.updatePrimaryInfo();
			assignment4.updateSecondaryInfo();
			assignment4.displayPrimaryInfo();
			assignment4.displayOtherInfo();
			assignment4.displayAllInfo();
	 }
 }