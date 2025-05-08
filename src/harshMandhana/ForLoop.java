package harshMandhana;

class ForLoop
{
	String name = "Harsh";
	void print()
	{
		for(int num =1; num<=5;num++)
		{
			System.out.println(name +" - "+ num);
		}
	}
	
	public static void main(String args[])
	{
		ForLoop forLoop = new ForLoop();
		forLoop.print();
	}
}