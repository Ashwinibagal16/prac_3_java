package rahulAlagoudar;

class Employee{
	String empFName = "Maulik";
	String empSName = "Kanani";
	int empId = 1212;
	
	void Display(){
		System.out.println(empFName);
		System.out.println(empSName);
		System.out.println(empId);
	}
	
	public static void main(String[] args){
		Employee s= new Employee();
		s.Display();
	}
}