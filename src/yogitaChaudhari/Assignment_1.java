package yogitaChaudhari;

public class Assignment_1 {
	
		String Fistname="Yogita";
		String Lastname="Chaudhari";
		int EmpyId=124;
		
		void displayeInfo(){
			System.out.println("My First name="+ Fistname);
			System.out.println("My Last name="+ Lastname);
			System.out.println("My Employee Id="+ EmpyId);
			
		}
		
		public static void main(String[]args){
			Assignment_1 emp = new Assignment_1();
			emp.displayeInfo();
			System.out.println(emp);
		}
		
		

	}

