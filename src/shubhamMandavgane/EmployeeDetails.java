package shubhamMandavgane;
class EmployeeDetails{
    int empid;
	String empFirstName;
	String empLastName;
	int empSalary;
	
	void empDetails(){
	   empid = 007;
	   empFirstName = "Shubham";
	   empLastName = "Mandavgane";
	   empSalary = 5000;
	}
	
	void updateSalary(){
	   empSalary = empSalary + 2000;   
	}
	
	void printempDetails(){
	    System.out.println("Employee id is " + empid);
	    System.out.println("Employee first name is " +  empFirstName);
	    System.out.println("Employee last name is " + empLastName);
        System.out.println("Employee current salary is " + empSalary);
	}
	
    public static void main(String[] args){
	          EmployeeDetails employeedetails = new EmployeeDetails();
			  employeedetails.empDetails();
			  employeedetails.updateSalary();
			  employeedetails.printempDetails();
			  
	}
}