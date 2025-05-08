package mayurKamble;

class BankOperationInfo{
	int balance;
	
	void creditAmt(int amount){
		balance=balance+amount;
		System.out.println(amount+" Rs. has been Credited");
	}
	
	void debitAmt(int amount){
		if(balance>=amount){
			balance=balance-amount;
			System.out.println(amount+" Rs. has been Debited");
		}else
			System.out.println("InSufficient balance, your ask is "+amount+" Rs but you only have "+balance+" Rs.");
	}
	
	void display(){
		System.out.println("Your Current Balance is "+balance+" Rs.");
	}
	
	void initBalance(int amount){
		balance=amount;
		System.out.println("Balance has been initialized with "+amount+" Rs.");
	}
	
	public static void main(String[]args){
		BankOperationInfo bankOperationInfo=new BankOperationInfo();
		bankOperationInfo.initBalance(5000);
		bankOperationInfo.creditAmt(2000);
		bankOperationInfo.creditAmt(500);
		bankOperationInfo.debitAmt(9500);
		bankOperationInfo.creditAmt(1500);
		bankOperationInfo.debitAmt(6000);
		bankOperationInfo.display();
	}
}