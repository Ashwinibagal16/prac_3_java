package mayurKamble;

class BankOperation{
	int balance;
	
	void creditAmt(){
		balance=balance+300;
		System.out.println("300 Rs. has been Credited");
	}
	
	void debitAmt(){
		if(balance>=500){
			balance=balance-500;
			System.out.println("500 Rs. has been Debited");
		}else
			System.out.println("In Sufficient balance, your ask is 500 rs but you only have "+balance+" rs.");
	}
	
	void display(){
		System.out.println("Your Current Balance is "+balance);
	}
	
	void initBalance(int amount){
		balance=amount;
		System.out.println("Balance has been initialized with "+amount+" Rs.");
	}
	
	public static void main(String[]args){
		BankOperation bankOperation=new BankOperation();
		bankOperation.initBalance(5000);
		bankOperation.creditAmt();
		bankOperation.creditAmt();
		bankOperation.debitAmt();
		bankOperation.creditAmt();
		bankOperation.debitAmt();
		bankOperation.display();
	}
}