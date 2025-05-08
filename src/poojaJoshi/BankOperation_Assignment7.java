package poojaJoshi;

class BankOperation_Assignment7{
	
	int balance;
	
	void initBalance(){
		balance = 5000;
		System.out.println("Balance has been initialized with" +balance+ " rs.");
	}
	
	void creditAmt(){
		balance = balance+300;
		//amt = amt+300;
		System.out.println(300 +" is credited and total balance is:" +balance+ " rs.");	
	}
	
	void debitAmt(){
		int debit=500;
		if (debit <= balance){
			balance= balance-debit;
			System.out.println(debit + " rs has been debited. and tital balance is :"+balance+ " rs.");
		}else{
			System.out.println("In Sufficient balance, your ask is "+debit+" rs but you only have "+balance+" rs.");
		}
	}
	
	void display(){
		System.out.println("Your current balance is " +balance+ " rs.");
	}
	
	public static void main(String[]args){
	BankOperation_Assignment7 bankOperation = new BankOperation_Assignment7();
	bankOperation.initBalance();
	bankOperation.creditAmt();
	bankOperation.creditAmt();
	bankOperation.debitAmt();
	bankOperation.creditAmt();
	bankOperation.debitAmt();
	bankOperation.display();
	}
}
