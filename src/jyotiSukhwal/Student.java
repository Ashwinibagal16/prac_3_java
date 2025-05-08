package jyotiSukhwal;

class Student{
	
	String name="Jyoti";
	int rollnumber=1;
	
	void display(){
		System.out.println(name);
		System.out.println(rollnumber);
	}

	public static void main(String args[]){
		Student s= new Student();
		s.display();
	}
}