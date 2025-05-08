package harshMandhana;

class Example
{
	int num1 = 10;
	int num2 = 20;
	
	void processData()
	{
		num1 = num1 + num2;
		num2 = num2+10;
	}
	
	void display()
	{
		System.out.println(num1 +" "+num2);
	}
	
	public static void main(String args[])
	{
		Example example1 = new Example();
		example1.processData();
		example1.display();
		
		Example example2 = new Example();
		example2.display();
	}
}