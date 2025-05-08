package shrutiPundikar;

class Student{
	String name="Shruti";
	int rno=1;
	
	void display(){
		System.out.println(name);
		System.out.println(rno);
	}
	
	public static void main(String[] args){
		Student s =	new Student();
		s.display();
		s.display();
	}
}