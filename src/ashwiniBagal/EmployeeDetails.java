package ashwiniBagal;

class EmployeeDetails{
    int empId;
    String empFirstName;
	String empLastName;
	int empSalary;
	
	void updateDetails(){
	     empId = 234;
		 empFirstName = "Ashwini";
		 empLastName  = "Bagal";
		 empSalary = 5000;
	}	 
	 
     void  updateSalary(){
           empSalary = empSalary + 3000;
    }

     void printDetail(){
          System.out.println("Employee Id name is " + empId);	 
          System.out.println("Employee First name is " + empFirstName);	 
		  System.out.println("Employee Last name is " + empLastName);	        	
		  System.out.println("Employee current Salary  is " + empSalary);
}

      public static void main(String[]args){
      	  EmployeeDetails employeeDetails = new EmployeeDetails();
		  employeeDetails.updateDetails();
		  employeeDetails.updateSalary();
		  employeeDetails.printDetail();
   }
}