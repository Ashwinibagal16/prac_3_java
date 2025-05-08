package harshMandhana;

class DivisibleMethod
{
	void printDivisible()
	{
		for(int num=1;num<=100;num++)
		{
			if(num%5==0 || num%7==0)
			{
				if(num%5==0 && num%7==0)
				{
					System.out.println(num+" is divisible by both 5 and 7");
				}
				else if(num%5==0)
				{
					System.out.println(num+" is divisible by 5");
				}
				else
				{
					System.out.println(num+" is divisible by 7");
				}
			}
		}
	}
	
	public static void main(String args[])
	{
		DivisibleMethod divisibleMethod = new DivisibleMethod();
		divisibleMethod.printDivisible();
	}
}