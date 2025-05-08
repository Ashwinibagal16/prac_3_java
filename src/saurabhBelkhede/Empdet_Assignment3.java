package saurabhBelkhede;
//Assignment 3
class Empdet{
	int empid= 11;
	String fName= "Saurabh";
	String lName= "Belkhede";
	int empSal = 1000;
	
	void updSal(){
		empSal=2000;
		System.out.println(empSal);
	}
	
	void display(){
		System.out.println("ID:" + empid);
		System.out.println("First Name:" + fName);
		System.out.println("Last Name:" + lName);
		System.out.println("Salary:" + empSal);
	}
	
	public static void main(String[] args) {
		Empdet emp=new Empdet();
		emp.display();
	}
}







	/*void empid(){
	System.out.println(empid);
	}
	
	void fName(){
	System.out.println(fName);
	}
	
	void lName(){
	System.out.println(lName);
	}
	
	void empSal(){
	System.out.println(empSal);
	}*/