package yogitaChaudhari;

public class Assignment_5 {
	
		int epmID=286;
		String empFirstName="Yogita";
		String empLastName="Chaudhari";
		int empSalary= 7000;
		
		void updateEmpSalary (){
			
			empSalary=empSalary+2000;
		}
		void printDetail (){
			System.out.println("Employee id is : "+epmID);
			System.out.println("Employee last name is : "+empFirstName);
			System.out.println("Employee first name is : "+empLastName);
			System.out.println("Employee current salary is : "+empSalary);
		}
		
		
		public static void main(String[] args){
			Assignment_5 employeeInfo = new Assignment_5();
			employeeInfo.printDetail();
			employeeInfo.updateEmpSalary();
			employeeInfo.printDetail();
			
		}
		
	
}
