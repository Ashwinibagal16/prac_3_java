package omkarBhujbal;

class BankOperation1 {
    int balance;

    void initBalance(int amount) {
        balance = amount;
        System.out.println("Balance has been initialized with " + balance + " rs.");
    }

    void creditAmt(int amt) {
        balance += amt;
        System.out.println(amt + " rs has been credited.");
    }

    void debitAmt(int amt) {
        if (amt > balance) {
            System.out.println("In Sufficient balance, your ask is " + amt + " rs but you only have " + balance + " rs.");
        } else {
            balance -= amt;
            System.out.println(amt + " rs has been debited.");
        }
    }

    void display() {
        System.out.println("Your current balance is " + balance + " rs.");
    }

    public static void main(String[] args) {
        BankOperation1 bo = new BankOperation1();
        bo.initBalance(5000);
        bo.creditAmt(2000);
        bo.creditAmt(500);
        bo.debitAmt(9500);
        bo.creditAmt(1500);
        bo.debitAmt(6000);
        bo.display();
    }
}
