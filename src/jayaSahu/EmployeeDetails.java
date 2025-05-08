package jayaSahu;

class EmployeeDetails{

      int empId;
	  String empFirstName; 
	  String empLastName;
	  int empSalary;
	  
	  void employeeInfo(){
		   empId = 123;
		   empFirstName = "Jaya";
		   empLastName = "Sahu";
		   empSalary   = 7000;
		   
	}
	
	    void updateDetail(){
			empSalary = empSalary + 2000;
			
	}
	
	    
		void printDetail (){
			System.out.println("Employee id is " + empId);
            System.out.println("Employee first name is " + empFirstName);
            System.out.println("Employee last name is " + empLastName);
            System.out.println("Employee current salary is " + empSalary);
			
		}
		
        
	
	
	    public static void main (String[] args){
			EmployeeDetails employeeDetail = new EmployeeDetails ();
			employeeDetail.employeeInfo();
			employeeDetail.updateDetail();
			employeeDetail.printDetail ();
			
			
		}
}