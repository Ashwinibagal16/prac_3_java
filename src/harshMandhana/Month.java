package harshMandhana;

class Month
{
	int month;
	void printMonth(int month)
	{
		if(month>=1 && month <=3)
		{
			if(month ==1)
			{
				System.out.println("Month index is "+month+" is in Q1, its January");
			}
			else if(month ==2)
			{
				System.out.println("Month index is "+month+" is in Q1, its Febuary");
			}
			else
			{
				System.out.println("Month index is "+month+" is in Q1, its March");
			}
		}
		else if(month>=4 && month <=6)
		{
			if(month ==4)
			{
				System.out.println("Month index is "+month+" is in Q2, its April");
			}
			else if(month ==5)
			{
				System.out.println("Month index is "+month+" is in Q2, its May");
			}
			else
			{
				System.out.println("Month index is "+month+" is in Q2, its June");
			}
		}
		else if(month>=7 && month <=9)
		{
			if(month ==7)
			{
				System.out.println("Month index is "+month+" is in Q3, its July");
			}
			else if(month ==8)
			{
				System.out.println("Month index is "+month+" is in Q3, its August");
			}
			else
			{
				System.out.println("Month index is "+month+" is in Q3, its September");
			}
		}
		else if(month>=10 && month <=12)
		{
			if(month ==10)
			{
				System.out.println("Month index is "+month+" is in Q4, its October");
			}
			else if(month ==11)
			{
				System.out.println("Month index is "+month+" is in Q4, its November");
			}
			else
			{
				System.out.println("Month index is "+month+" is in Q4, its December");
			}
		}
		else if(month<=0)
		{
			System.out.println("Invalid month index, it can't be zero or negative");
		}
		else
		{
			System.out.println("Invalid month index, it can't be greater than 13");
		}
	}
	
	public static void main(String args[])
	{
		Month month = new Month();
		month.printMonth(5);
		month.printMonth(2);
		month.printMonth(-3);
		month.printMonth(15);
	}
}