package rahulAlagoudar;

class Bank2{

  String bankName = "HDFC Bank";
  static int debCount = 0;
  static int creCount = 0;
  
  
  void Debit(){
    debCount=debCount+1;
  }
  
  void credit(){
    creCount=creCount+1;
  }
  
  void display(){
    System.out.println("Debit count is" + " - " + debCount);
    System.out.println("Credit count is: " + " - " + creCount);
  }
  
  
  public static void main(String[] args){
    Bank2 bank = new Bank2();
    Bank2 bank2 = new Bank2();
    bank.Debit();
    bank2.Debit();
    bank2.Debit();
    bank.Debit();
    bank.Debit();
    bank.Debit();
    bank.credit();
    bank2.credit();
    bank.credit();
    bank2.credit();
    bank.credit();
    bank.display();
  
  }
}
