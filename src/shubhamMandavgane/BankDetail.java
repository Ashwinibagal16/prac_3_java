package shubhamMandavgane;
class BankDetail{
   int balance = 1000;
   static int debitCount = 0;
   static int creditCount = 0;
   static int printStatementCount = 0;
   static int printCountInfo = 0;
   
  void debitAmt(){
    debitCount = debitCount+1;
	 balance = balance - 200;
  }
  
  void creditAmt(){
    creditCount = creditCount + 1;
	balance = balance + 400;
  }
  
  void printStatement(){
    printStatementCount = printStatementCount +1;
    System.out.println("remaining balance is " + balance);
  }
  
  void printCountInfo(){
    System.out.println("debit method call count " + debitCount);
	System.out.println("credit  method call count " + creditCount);
	System.out.println("printstatment method call count " + printStatementCount);
  }
  
   public static void main(String[] args){
       BankDetail bankdetail = new BankDetail();
	     bankdetail.debitAmt();
		 bankdetail.creditAmt();
		 bankdetail.creditAmt();
		 bankdetail.creditAmt();
		 bankdetail.printStatement();
		 bankdetail.printCountInfo();
		 
   }

 
}