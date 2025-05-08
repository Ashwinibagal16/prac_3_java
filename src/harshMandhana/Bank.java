package harshMandhana;

class Bank
{
	int balance = 1000;
	
	void debitAmount()
	{
		int debitAmount = 500;
		balance = balance-debitAmount;
	}
	
	void creditAmount()
	{
		int creditAmount = 200;
		balance = balance+creditAmount;
	}
	
	void printBalance()
	{
		System.out.println("Remaining balance is: "+ balance);
	}
	
	public static void main(String args[])
	{
		Bank bank = new Bank();
		bank.debitAmount();
		bank.creditAmount();
		bank.creditAmount();
		bank.printBalance();
		bank.creditAmount();
		bank.printBalance();
		bank.debitAmount();
		bank.printBalance();
	}
	
}