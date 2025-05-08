/*
Create a class called BankOperation, which should 4 methods.

Set your initial balance by calling initBalance method.


1. creditAmt : which should increase balance by 300 rs

2. debitAmt : which should deduct balance by 500 rs

3. display : which should print current balance.

4. initBalance : which should initiliase your balance with given amount.

from main method, calling sequence should be,

initBalance(5000);

creditAmt(2000);

creditAmt(500);

debitAmt(9500);

creditAmt(1500);

debitAmt(6000);

display();

output :

Balance has been initialized with 5000 rs.

2000 rs has been credited.

500 rs has been credited.

In Sufficient balance,  if your ask is 9500 rs but you only have 7500 rs.

1500 rs has been credited.

6000 rs has been debited.

Your current balance is 3000 rs.

Hint : System.out.println("In Sufficient balance, your ask is "+amt+" rs but you only have "+balance+" rs.")

void creditAmt(int amt){

System.out.println(amt + " rs has been credited.");}*/
package madhuriMalvi;
class BankOperation{
	int balance; //5000 //7000 // 7500
	
	void initBalance(int bal){
		balance = bal;
		System.out.println("Balance has been initialized with " + balance + " rs.");
	}
	
    void creditAmt(int creditAmt){
		balance = balance + creditAmt;
		System.out.println(creditAmt + " rs has been credited.");
	}
	
    void debitAmt(int debitAmt){
		if( balance < debitAmt ){
			System.out.println("In Sufficient balance, your ask is " + debitAmt + " rs but you only have " + balance + " rs.");
		}
		else if(debitAmt == 0)
			System.out.println("Debit amount should be greater than 0");
		else if( balance > debitAmt){
			balance = balance - debitAmt;
			System.out.println(debitAmt + " rs has been debited.");//500
		}
		else
			System.out.println("Invalid Debit Request");
	}
	
    void  display(){
		System.out.println("Current balance is " + balance);
	}
	public static void main(String[] args){
		BankOperation bankoperation = new BankOperation();
		bankoperation.initBalance(5000);
		bankoperation.creditAmt(2000); 
		bankoperation.creditAmt(500); 
		bankoperation.debitAmt(9500); // checked with 9500, 5000 , 0
		bankoperation.creditAmt(1500);
		bankoperation.debitAmt(6000);
		bankoperation.display();
		
	}
}




