package vaibhavPatil;


class Emp{
	int empId;
	String empFirstName;
	String empLastName;
	int empSalary;
	
	void updatedetails(){
		empId=123;
		empFirstName="vaibbhav";
		empLastName="patil";
		empSalary= 5000;
	}
	
	void updateSalary(){
		empSalary=empSalary+2000;	
	}
	
	void printDetail(){
		System.out.println("Employee Id is "+empId);
		System.out.println("Employee Firt Name is "+empFirstName);
		System.out.println("Employee Last Name is "+empLastName);
		System.out.println("Employee Current salary is "+empSalary);
	}
	
	public static void main(String[] args){
		Emp ed = new Emp();
		ed.updatedetails();
		ed.updateSalary();
		ed.printDetail();
	}

	
}