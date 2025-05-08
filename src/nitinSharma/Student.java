package nitinSharma;
class Student{
	String name="Nitin";
	int rno=1;
	
	void display(){
		System.out.println("My name is: "+name);
		System.out.println("My rollno. is: "+rno);
	}
	
	public static void main(String[] args){
		Student s=new Student();
		s.display();
	}
}