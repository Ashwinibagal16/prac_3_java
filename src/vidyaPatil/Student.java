package vidyaPatil;

class Student{
	
	String name = "Vidya";
	int rno=1;

	void displayInfo(){
		System.out.println(name);
		System.out.println(rno);		
	}
	
	public static void main(String[] args){
		Student s = new Student();
		s.displayInfo();
		s.displayInfo();
	}
}