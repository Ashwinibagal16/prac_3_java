package vivekRahate;
class Student{
	String firstName = "Vivek";
	int rollNo = 12345;
	int age = 45;
	
	void displayInfo(){
		System.out.println(firstName + " " + rollNo + " " + age );
	}
	
	public static void main(String a[]){
		Student st = new Student();
		st.displayInfo();
	}		
}