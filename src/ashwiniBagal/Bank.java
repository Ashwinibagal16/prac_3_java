package ashwiniBagal;

class Bank{
     int Balance =1000;
	 
	 void debitAmt(){
	    Balance = Balance - 500;
	}
	
	  void creditAmt(){
	     
         Balance = Balance + 200;
  }
   
      void printBalance(){
	      System.out.println("Remaining Balance is" + Balance);
  }
  
       public static void main(String[] args){
	     Bank bank = new Bank();
		 bank.debitAmt();
		 bank.creditAmt();
		 bank.creditAmt();
		 bank.printBalance();
		 bank.creditAmt();
		 bank.printBalance();
         bank.debitAmt();
         bank.printBalance();
	}	 
 }
  