package poojaJoshi;

class Student{
	
	String name="Pooja";
	int rno=1;
	
	void display(){
		System.out.println(name);
		System.out.println(rno);
	}
	
	public static void main(String[] args){
		Student s = new Student();
		s.display();
	}
}