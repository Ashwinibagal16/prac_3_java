package najneenMalgave;

class Example1{

	String firstName = "Najneen";
	String lastName = "Malgave";
	int employeeId = 14;

	void display(){
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(employeeId);
	}

	public static void main(String[] args){
		Example1 example1 = new Example1();
		example1.display();
	}
}
