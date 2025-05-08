package harshMandhana;

class Student
{
	String name = "Harsh";
	int rollNo = 1;	
	
	void display()
	{
		System.out.println(name);
		System.out.println(rollNo);
	}
	
	public static void main(String args[])
	{
		Student harsh = new Student();
		harsh.display();
	}
}