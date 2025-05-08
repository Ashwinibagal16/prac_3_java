package ojaswini;
class BankDetail{
  int debitCount;
  int creditCount;
  int printStatementCount;
  int balance=1000;
  
  void debitAmt(){
     balance=balance-200;
	 debitCount=debitCount+1;
  }
  
  void creditAmt(){
     balance=balance+400;
	 creditCount=creditCount+1;
  }
  
  void printStatement(){
     System.out.println("Remaining balance is "+balance);
	 printStatementCount=printStatementCount+1;
  }
  
  void printCountInfo(){
     System.out.println("debit method call count "+debitCount);
	 System.out.println("credit method call count "+creditCount);
     System.out.println("print statement call count "+printStatementCount);
  }
  
  public static void main(String[] args){
     BankDetail b = new BankDetail();
	 b.debitAmt();
	 b.creditAmt();
	 b.creditAmt();
	 b.creditAmt();
	 b.printStatement();
	 b.printCountInfo();
  }
}


