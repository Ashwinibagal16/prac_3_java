package chandniFatehchandani;

class Student{

	String name = "Chandni";
	int rno = 1;
	
	void display(){
		
		System.out.println(name);
		System.out.println(rno);
	}
	
	public static void main (String[] args){
		Student S = new Student();
		S.display();
	}
}

