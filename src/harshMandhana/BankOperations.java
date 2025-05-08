package harshMandhana;

class BankOperations
{
	int balance;
	
	void creditAmt()
	{
		balance = balance + 300;
		System.out.println(300+" rs has been credited");
	}
	
	void debitAmt()
	{
		if(balance < 500)
		{
			System.out.println("Insufficient balance, your ask is for "+500+" rs but you only have "+balance+" rs");
		}
		else
		{
			balance = balance - 500;
			System.out.println(500+" rs has been debited");
		}
	}
	
	void display()
	{
		System.out.println("Your current balance is "+balance+" rs");
	}
	
	void initBalance(int amount)
	{
		balance = balance + amount;
		System.out.println("Balance has been initialized with "+amount+" rs");
	}
	
	public static void main(String args[])
	{
		BankOperations bankOperations = new BankOperations();
		bankOperations.initBalance(5000);
		bankOperations.creditAmt();
		bankOperations.creditAmt();
		bankOperations.debitAmt();
		bankOperations.creditAmt();
		bankOperations.debitAmt();
		bankOperations.display();
	}
	
}