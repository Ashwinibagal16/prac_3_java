package pratikWaghmare;
class Student{
	String name = "Pratik";
	int roll_no = 13;
	
	void showStudentInfo(){
		System.out.println(name);
		System.out.println(roll_no);
		
	}
	
	public static void main (String[] name){
		Student S = new Student();
		S.showStudentInfo();
		
	}
}