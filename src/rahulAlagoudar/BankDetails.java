package rahulAlagoudar;

class BankDetails{
  
  int balance = 1000;
  int debitCount;
  int creditCount;
  int printStatementCount;
  
  void debitAmount(){
    debitCount = debitCount + 1;
    balance = balance - 200;
  }
  
  void creditAmount(){
    creditCount = creditCount + 1;
    balance = balance + 400;
  }
  
  void printStatement(){
    printStatementCount = printStatementCount + 1;
  }
  
  void printCountInfo(){
    System.out.println("Remaining Balance is -> " + balance);
    System.out.println("Debit Method call count -> " + debitCount);
    System.out.println("Credit Method call count -> " + creditCount);
    System.out.println("Print Statement Method call count -> " + printStatementCount);
  }
  
  public static void main(String[] args){
    BankDetails bankDetails = new BankDetails();
    bankDetails.creditAmount();
    bankDetails.creditAmount();
    bankDetails.creditAmount();
    bankDetails.debitAmount();
    bankDetails.printStatement();
    bankDetails.printCountInfo();
  }
}