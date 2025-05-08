package harshMandhana;

class Even
{
	void evenNumbers()
	{
		for(int num=10; num <= 15; num++)
		{
			if(num%2==0)
			{
				System.out.println(num);
			}
		}
	}
	
	public static void main(String args[])
	{
		Even even = new Even();
		even.evenNumbers();
	}
}