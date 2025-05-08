package shubhamMandavgane;
class BankOperation{
	int amount;
	
	void initlBalance(int balance){
		amount = amount + balance;
		System.out.println("Balance has been initialized with " + amount + " rs.");
	}
	
	void creditAmt(int cdAmt){
		amount = amount + cdAmt;
		System.out.println(cdAmt+ " rs has been credited. ");
	}
	
	void debitAmt(int dbAmt){
		if(amount>=dbAmt){
			amount = amount - dbAmt;
			System.out.println(dbAmt+ " rs has been debited. ");
		}else{
			System.out.println("In Sufficient balance, your ask is " + amount + " rs but you only have " +dbAmt+ " rs.");
		}
	}
	
	void display(){
		System.out.println("Your current balance is " +amount + " rs. ");
	}
	
	public static void main(String[] args){
		BankOperation bankoperation = new BankOperation();
		bankoperation.initlBalance(5000);
		bankoperation.creditAmt(2000);
		bankoperation.creditAmt(500);
		bankoperation.debitAmt(9500);
		bankoperation.creditAmt(1500);
		bankoperation.debitAmt(6000);
		bankoperation.display();
	}
}