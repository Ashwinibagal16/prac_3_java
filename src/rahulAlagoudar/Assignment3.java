package rahulAlagoudar;

class Assignment3{

	String firstName = "Pushkar";
	String middleName = "Rajesh";
	String lastName = "Vedpathak";
	int age = 26;
	
	void display(){
		System.out.println(firstName);
		System.out.println(middleName);
		System.out.println(lastName);
		System.out.println(age);
	}
	
	public static void main(String[] args){
		Assignment3 assignment3 = new Assignment3();
		assignment3.display();
	}
}