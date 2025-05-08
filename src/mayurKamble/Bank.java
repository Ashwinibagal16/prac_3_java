package mayurKamble;

class Bank{
	int balance=1000;
	int count;
	
	void debitAmt(){
		balance=balance-500;
		count++;
	}
	
	void creditAmt(){
		balance=balance+200;
		count++;
	}
	
	void printBalance(){
		System.out.println("Remaining Balance is "+balance);
	}
	
	public static void main (String[]args){
		Bank bank=new Bank();
		bank.debitAmt();
		bank.creditAmt();
		bank.creditAmt();
		bank.printBalance();
		bank.creditAmt();
		bank.printBalance();
		bank.debitAmt();
		bank.printBalance();
	}
}