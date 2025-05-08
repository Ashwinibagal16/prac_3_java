package rahulAlagoudar;

class BankDetails1{
  
  int debitCount;
  int creditCount;
  int printStatementCount;
  static int totalDebitCount;
  static int totalCreditCount;
  static int totalPrintStatementCount;
  
  void debitC(){
    debitCount = debitCount + 1;
    totalDebitCount = totalDebitCount + 1;
  }
  
  void creditC(){
    creditCount = creditCount + 1;
    totalCreditCount = totalCreditCount + 1;
  }
  
  void printStatementC(){
    printStatementCount = printStatementCount + 1;
    totalPrintStatementCount = totalPrintStatementCount + 1;
  }
  
  void printCountInfo(){
    System.out.println("Debit Method call count -> " + debitCount);
    System.out.println("Credit Method call count ->" + creditCount);
    System.out.println("Print Statement method call count -> "+ printStatementCount);
  }
  
  void displayprintCountInfo(){
    System.out.println("Total Debit Method call count -> " + totalDebitCount);
    System.out.println("Total Credit Method call count ->" + totalCreditCount);
    System.out.println("Total Print Statement method call count -> "+ totalPrintStatementCount);
  }
  
  public static void main(String[] args){
    BankDetails1 bankDetails_1 = new BankDetails1();
    bankDetails_1.debitC();
    bankDetails_1.creditC();
    bankDetails_1.creditC();
    bankDetails_1.creditC();
    bankDetails_1.printStatementC();
    bankDetails_1.printCountInfo();
    
	BankDetails1 bankDetails_2 = new BankDetails1();
    System.out.println();
    bankDetails_2.creditC();
    bankDetails_2.printStatementC();
    bankDetails_2.printStatementC();
    bankDetails_2.printStatementC();
    bankDetails_2.printCountInfo();
    
	BankDetails1 bankDetails_3 = new BankDetails1();
    System.out.println();
    bankDetails_3.displayprintCountInfo();
  }
}