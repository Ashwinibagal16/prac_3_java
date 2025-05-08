/* 1. Assignment - 8 : 24th April'25

Same as Assignment - 7 but with credit and debit method as parameterized. 
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

Your current balance is 3000 rs.

Hint : System.out.println("In Sufficient balance, your ask is "+amt+" rs but you only have "+balance+" rs.")

void creditAmt(int amt){

System.out.println(amt + " rs has been credited.");}

 */

package pranitaPurnik;
class Assignment8_BankOperation{
	
	 int balance;
	 
	 void initBalance(int amount){
		 balance=amount;
		 System.out.println("Balance has been initialized with "+amount+"rs.");
	 }
	 
	 void creditAmt(int creditAmount){
		 balance=balance+creditAmount;
		 System.out.println(creditAmount+" rs has been credited.");
		 
	 }
	 
	 void debitAmt(int debitAmount){
		 if(balance>=debitAmount){
			balance=balance-debitAmount;
			System.out.println(debitAmount+" rs has been debited.");
		 }else{
			System.out.println("In Sufficient balance, your ask is "+debitAmount+" rs but you only have "+balance+" rs.");
		 } 	 
	 }
	 
	 void display(){
		System.out.println("Current balance is: "+balance);
	 }
	 
	 public static void main(String[] args){
		Assignment8_BankOperation assignment8 = new Assignment8_BankOperation();
		assignment8.initBalance(5000);
		assignment8.creditAmt(2000);
		assignment8.creditAmt(500);
		assignment8.debitAmt(9500);
		assignment8.creditAmt(1500);
		assignment8.debitAmt(6000);
		assignment8.display();
	}
	 
	 
 }