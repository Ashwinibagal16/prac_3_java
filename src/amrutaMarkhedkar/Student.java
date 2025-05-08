package amrutaMarkhedkar;

class Student{
	String name = "Amruta";
	int rno = 1;
	
	void display(){
		System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rno);
    }

	
	public static void main(String [] args){
		Student student = new Student();
		student.display();
	}
	
}