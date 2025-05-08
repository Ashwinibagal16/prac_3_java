package harshMandhana;

class Day
{
	void printDay(int day)
	{
		if(day >= 1 && day <= 5)
		{
			System.out.println("Its a Weekday.");
			if(day == 1)
			{
				System.out.println("Monday.");
			}
			else if(day == 2)
			{
				System.out.println("Tuesday.");
			}
			else if(day == 3)
			{
				System.out.println("Wednesday.");
			}
			else if(day == 4)
			{
				System.out.println("Thrusday.");
			}
			else
			{
				System.out.println("Friday.");
			}
		}
		else if(day == 6 || day ==7)
		{
			System.out.println("Its a Weekend.");
			if(day == 6)
			{
				System.out.println("Saturday.");
			}
			else
			{
				System.out.println("Sunday.");
			}
		}
		else
		{
			System.out.println("Invalid day index");
		}
	}
	
	public static void main(String args[])
	{
		Day day = new Day();
		day.printDay(3);
		day.printDay(7);
		day.printDay(0);
	}
}