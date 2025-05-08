package amrutaMarkhedkar;

class BankOperation{
	
	static int balance;
	
	void initBalance(int bal){
		balance = bal;
		System.out.println("Balance has been initialized with "+bal+" rs.");
	}
	
	void creditAmt(int amt){
		balance = balance + amt;
		System.out.println(amt + " rs has been credited.");
	}
	
	void debitAmt(int amt){
		if(balance >=amt){
			balance = balance - amt;
			System.out.println(amt + " rs has been debited.");
		}else{
			System.out.println("Insufficient balance, your ask is "+amt+" rs but you only have "+balance+" rs.");
		}
	}

	void display(){
			System.out.println("Your current balance is "+balance+ "rs.");
	}

    public static void main(String [] args){
		BankOperation bankOp = new BankOperation();
		bankOp.initBalance(5000);
		bankOp.creditAmt(2000);
		bankOp.creditAmt(500);
		bankOp.debitAmt(9500);
		bankOp.creditAmt(1500);
		bankOp.debitAmt(6000);
		bankOp.display();
}
}