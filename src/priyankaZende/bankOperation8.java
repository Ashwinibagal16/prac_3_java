/*
Create a class called BankOperation, which should 4 methods.
Set your initial balance by caling initBalance method.

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
In Sufficient balance, your ask is 9500 rs but you only have 7500 rs.
1500 rs has been credited.
6000 rs has been debited.
Your current balance is 3000 rs.void

Hint : System.out.println("In Sufficient balance, your ask is "+amt+" rs but you only have "+balance+" rs.")
void creditAmt(int amt){
    System.out.println(amt + " rs has been credited.");
}
*/
package priyankaZende;

class BankOperation8{
	
	int balance = 0;

	void initBalance(){
		balance = 5000;
	}
	
	void creditAmtOnce(){
		balance = balance + 2000;
		System.out.println(2000 + " rs has been credited.");
	}
	
	void creditAmtTwice(){
		balance = balance + 500;
		System.out.println(500 + " rs has been credited.");
	}
	
	void creditAmtThrice(){
		balance = balance + 1500;
		System.out.println(1500 + " rs has been credited.");
	}
		
	void debitAmtOnce(){
		if(balance < 9500){
			System.out.println("In Sufficient balance, your ask is "+9500+" rs but you only have "+balance+" rs.");
		} else{
			balance = balance - 9500;
			System.out.println(9500 + " rs has been debited.");
		}
	}
	
	void debitAmtTwice(){
		if(balance < 6000){
			System.out.println("In Sufficient balance, your ask is "+6000+" rs but you only have "+balance+" rs.");
		} else{
			balance = balance - 6000;
			System.out.println(6000 + " rs has been debited.");
		}
	}

	void display(){
		System.out.println("Your current balance is " + balance + " rs.");
	}

	public static void main(String[] args){
		BankOperation8 bankOperation8 = new BankOperation8();
		bankOperation8.initBalance();
		bankOperation8.creditAmtOnce();
		bankOperation8.creditAmtTwice();
		bankOperation8.debitAmtOnce();
		bankOperation8.creditAmtThrice();
		bankOperation8.debitAmtTwice();
		bankOperation8.display();
	}
}	