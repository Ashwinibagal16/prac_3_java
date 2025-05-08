package abhaBokade;
class Student{
	String name="Abha";
	int rno=1;
	
	void displayInfo(){
		System.out.println(name);
		System.out.println(rno);
	}

	public static void main(String[] args){
		Student s = new Student();
		s.displayInfo();
	}
}