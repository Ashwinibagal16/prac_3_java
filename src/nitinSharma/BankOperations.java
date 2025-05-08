package nitinSharma;
class BankOperations{
	 int balance;
	
	void intiBlanace(int amt){
		balance = amt;
		System.out.println("Amount has been initialized with: "+ amt + "rs.");
	}
	
	void creditAmt(int amt){
		balance += amt;
		System.out.println(amt+ " rs. has been credited");
	}
	
	void debitAmt(int amt){
	 	if(amt>balance){
			System.out.println("Insufficient balance, your ask is: "+ amt+" rs., but you have only: "+balance+" rs."); 
		}else{
			balance-=amt;
			System.out.println(amt+ " rs. has been debited");
		}
		
	}
	
	void display(){
		System.out.println("Your current balance is: "+ balance+ " rs.");
	}
	
	public static void main(String[] args){
		BankOperations bankOperation = new BankOperations();
		bankOperation.intiBlanace(5000);
		bankOperation.creditAmt(2000);
		bankOperation.creditAmt(500);
		bankOperation.display();
		System.out.println("-----------------------------------------");
		bankOperation.debitAmt(9500);
		System.out.println("-----------------------------------------");
		bankOperation.creditAmt(1500);
		bankOperation.debitAmt(6000);
		System.out.println("-----------------------------------------");
		bankOperation.display();
		
		
	}
}