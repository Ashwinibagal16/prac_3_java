package rahulAlagoudar;

class BankOperation{
  int credAmt;
  int debAmt;
  static int bal =10000;
  void balInit(){
    System.out.println("Balance has been initilised with: "+bal+".");
    System.out.println();
  }
  
  void creditAmt(int credAmt){
    System.out.println("Account holder wants to deposit: "+credAmt+".");
    bal=bal+credAmt;
    System.out.println("Balance has been credited by:"+credAmt);
    System.out.println();
  }
  
  void debitAmt(int debAmt){
    System.out.println("Account holder wants to withdraw: "+debAmt+".");
    if(bal<debAmt){
      System.out.println("Insufficient balance. Your ask is " +debAmt+ " but your Balance is: "+bal+".");
      System.out.println();
    }
	
    else{
      bal=bal-debAmt;
      System.out.println("Balance has been debited by:"+debAmt);
      System.out.println();
        }
  }
  
  void display(){
    System.out.println("Current balance is: "+bal);
    System.out.println();
  }
  
  public static void main(String[] args){
    BankOperation BnkOp=new BankOperation();
    BnkOp.balInit();
    BnkOp.debitAmt(15000);
    BnkOp.creditAmt(15000);
    BnkOp.display();
    BnkOp.debitAmt(15000);
    BnkOp.display();
  }
}








