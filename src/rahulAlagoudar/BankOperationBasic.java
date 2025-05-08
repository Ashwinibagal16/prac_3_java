package rahulAlagoudar;

class BankOperationBasic{
  int credAmt =300;
  int debAmt=200;
  static int bal;
  
  void balInit(){
    bal=1000;
    System.out.println("Balance has been initilised with: "+bal+".");
    System.out.println();
  }
  
  void creditAmt(){
    System.out.println("Account holder wants to deposit: "+credAmt+".");
    bal=bal+credAmt;
    System.out.println("Balance has been credited by:"+credAmt);
    System.out.println("Current Balance remaining:"+bal);
  }
  
  void debitAmt(){
    System.out.println("Account holder wants to withdraw: "+debAmt+".");
    if(bal<debAmt){
      System.out.println("Insufficient balance. Your ask is " +debAmt+ " but your Balance is: "+bal+".");
    }
    else{
      bal=bal-debAmt;
      System.out.println("Balance has been debited by:"+debAmt);
        }
    System.out.println("Current Balance remaining:"+bal);
    System.out.println();
  }
  
  void display(){
    System.out.println("Current balance is: "+bal);
    System.out.println();
  }
  
  public static void main(String[] args){
    BankOperationBasic BnkOp=new BankOperationBasic();
    BnkOp.balInit();
    BnkOp.debitAmt();
    BnkOp.creditAmt();
    BnkOp.display();
    BnkOp.debitAmt();
    BnkOp.display();
  }
}








