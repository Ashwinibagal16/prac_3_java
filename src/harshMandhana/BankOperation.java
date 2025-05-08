package harshMandhana;

class BankOperation
{
	int balance;
	
	void creditAmt(int amount)
	{
		balance = balance + amount;
		System.out.println(amount+" rs has been credited");
	}
	
	void debitAmt(int amount)
	{
		if(balance < amount)
		{
			System.out.println("Insufficient balance, your ask is for "+amount+" rs but you only have "+balance+" rs");
		}
		else
		{
			balance = balance - amount;
			System.out.println(amount+" rs has been debited");
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
		BankOperation bankOperation = new BankOperation();
		bankOperation.initBalance(5000);
		bankOperation.creditAmt(2000);
		bankOperation.creditAmt(500);
		bankOperation.debitAmt(9500);
		bankOperation.creditAmt(1500);
		bankOperation.debitAmt(6000);
		bankOperation.display();
	}
	
}