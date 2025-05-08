package harshMandhana;

class Divisible
{
	void print()
	{
		for(int num=1; num<=100;num++)
		{
			if(num%3==0 || num%5==0)
			{	
				System.out.println(num+" is divisible by 3 or 5");
			}
		}
	}
	
	public static void main(String args[])
	{
		Divisible divisible = new Divisible();
		divisible.print();
	}
}