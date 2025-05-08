package rahulAlagoudar;

class Student{
	String Name = "techno";
	int rollno = 1;
	
	void Display(){
		System.out.println("Name:"+Name);
		System.out.println("roll no:"+rollno);
	}
	
	public static void main(String[] args){
		Student s= new Student();
		s.Display();
		s.Display();
		s.Display();
		s.Display();
		s.Display();
		s.Display();
		s.Display();
		s.Display();
	}
}