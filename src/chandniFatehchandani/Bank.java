package chandniFatehchandani;

/*Create a class called Bank.
Have one instance variable called balance, initial balance is 1000 rs.
Create a method to debitAmt, creditAmt, printBalance.
debitAmt method will debitAmt by 500 rs.
createAmt method will creditAmt by 200 rs.
input :
debitAmt()
creditAmt()
creditAmt()
printBalance()
creditAmt()
printBalance()
debitAmt()
printBalance()
output :
Remaning balance is 900
Remaning balance is 1100
Remaning balance is 600*/

class Bank{
	int balance = 1000;
	
	void debitAmt(){
		balance = balance - 500;
	}
	
	void creditAmt(){
		balance = balance + 200;
	}
	
	void printBalance(){
		System.out.println("Remaining balance is " + balance);
	}
	
	public static void main(String[] args){
		Bank b = new Bank();
		b.debitAmt();
		b.creditAmt();
		b.creditAmt();
		b.printBalance();
		b.creditAmt();
		b.printBalance();
		b.debitAmt();
		b.printBalance();
	}
}
