package yogeshGhuge;

class Assignment3{

	String empId;
	String empfirstName;
	String emplastName;
	int empSalary ;
	
	void initialised (){
	
		empId = "123";
		empfirstName= "yogesh";
		emplastName = "Ghuge";
		empSalary = 5000;
	
	}
	
	void updateSalary(){
		empSalary = empSalary + 2000;
	
	}
	
	void printDetail(){
		System.out.println("Employee id is :" + empId );
		System.out.println("Employee FirstName is:" + empfirstName );
		System.out.println("Employee LastName is :" + emplastName);
		System.out.println("Employee current salary is:" + empSalary );
		
	
	}
	
	public static void main(String[] args){
		Assignment3 empD = new Assignment3();
		empD.initialised();
		empD.updateSalary();
		empD.printDetail();
		
		
	}
	
}