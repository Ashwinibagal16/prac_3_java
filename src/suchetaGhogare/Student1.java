package suchetaGhogare;

class Student1{
	String name = "Sucheta";
	int rno = 1;

	void display(){
		System.out.println(name);
		System.out.println(rno);
	}

	public static void main(String[] args){
		Student1 s = new Student1();
		s.display();

	}
}