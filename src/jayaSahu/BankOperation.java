package jayaSahu;
class BankOperation{
     int balance;
	 
	 void initBalance(int amt){
		 balance = amt;
		 System.out.println("Balance has been initialized with" + amt + "rs");
	}
	 
	 void creditAmt(int amt){
		 balance += 300;
		 System.out.println(amt + "rs has been credited");
	}
	 
	 void debitAmt(int amt){
		 if(amt > balance){
	     System.out.println("In Sufficient balance, your ask is " + amt + " rs but you only have " + balance + " rs.");
		 }else {
			 balance -=500;
			  System.out.println(amt + "rs has been debited");
		}
	}
	 
	 void display(){
		 System.out.println("your current balance is" + balance + "rs");
	}
	
	public static void main(String[] args){
		BankOperation bo = new BankOperation();
		bo.initBalance(5000);
		bo.creditAmt(2000);
		bo.creditAmt(500);
		bo.debitAmt(9500);
		bo.creditAmt(1500);
		bo.debitAmt(6000);
		bo.display();
	}
}