package yogitaChaudhari;

public class Assignment_4 {
	
		int empid;
		String empFirstName;
		String empLastName;
		int empSalary;
		
		void updateData(){
			empid=123;
			empFirstName="Yogita";
			empLastName="Chaudhari";
			empSalary=20000;	
		}
		void updateSalary(){
			
			empSalary=empSalary+2000;
			System.out.println("Updated Salary is "+ empSalary);
		}
		void printDetail (){
			System.out.println("Emp id Salary is "+ empid);
			System.out.println("Emp FirstName is "+ empFirstName);
			System.out.println("EmpLastName is "+ empLastName);
			System.out.println("Emp Salary is "+ empSalary);
		}
		public static void main(String[] args){
			Assignment_4 employeeDetails = new Assignment_4();
			employeeDetails.updateData();
			employeeDetails.printDetail();
			employeeDetails.updateSalary();
			
		}
	
}
