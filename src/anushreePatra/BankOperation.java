package anushreePatra;

class BankOperation{
	int balance = 1000;
	
	void creditAmt(){
		balance = balance + 300;
		System.out.println(300 + "rs has been credited " + "and total balance is rs" + balance);
	}
	void debitAmt(){
		if(balance>=500){
		balance = balance - 500;
		System.out.println(500 + "rs has been debited" + "total balance is rs" + balance);
		} else{
		System.out.println("Insufficent balance");	
		System.out.println("Remaining amount is rs" + balance);
    }
		}
	
	public static void main(String[] args){
		BankOperation bankOperation = new BankOperation();
		bankOperation.creditAmt();
		bankOperation.debitAmt();
		bankOperation.debitAmt();
		bankOperation.debitAmt();
	}
}