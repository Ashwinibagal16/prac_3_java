package poojaJoshi;

class Assignment8{
	int balance;
	
	void initBalance(int bal){
		balance = bal;
		System.out.println("Balance has been initialized with" +balance+ " rs.");
	}
	
	void creditAmt(int amt){
		amt = amt+300;
		balance = amt+balance;
		System.out.println(amt +" rs has been credited");	
	}
	
	void debitAmt(int debit){
		if (debit <= balance){
			balance= balance-debit;
			System.out.println(debit + " rs has been debited.");
		}else{
			System.out.println("In Sufficient balance, your ask is "+debit+" rs but you only have "+balance+" rs.");
		}
	}
	
	void display(){
		System.out.println("Your current balance is " +balance+ "rs");
	}
	
	public static void main(String[]args){
	Assignment8 assign8 = new Assignment8();
	assign8.initBalance(5000);
	assign8.creditAmt(2000);
	assign8.creditAmt(500);
	assign8.debitAmt(9500);
	assign8.creditAmt(1500);
	assign8.debitAmt(6000);
	assign8.display();
	}
}

