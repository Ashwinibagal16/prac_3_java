package harshMandhana;

class Divisibility
{
	void print()
	{
		for(int num = 5; num <=40 ; num++)
		{
			if(num%3 == 0 && num%5 ==0)
			{
				System.out.println(num);
			}
		}
	}
	
	public static void main(String args[])
	{
		Divisibility divisibility = new Divisibility();
		System.out.println("Number divisible by both 3 and 5 are:");
		divisibility.print();
	}
}