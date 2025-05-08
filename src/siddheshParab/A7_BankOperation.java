package siddheshParab;

class A7_BankOperation {

    int balance;  // default access

    void initBalance() {
        balance = 5000;
        System.out.println("Balance has been initialized with 5000 rs.");
    }

    void creditAmt() {
        balance += 300;
        System.out.println("300 rs has been credited.");
    }

    void debitAmt() {
        if (balance >= 500) {
            balance -= 500;
            System.out.println("500 rs has been debited.");
        } else {
            System.out.println("In Sufficient balance, your ask is 500 rs but you only have " + balance + " rs.");
        }
    }

    void display() {
        System.out.println("Your current balance is " + balance + " rs.");
    }

    public static void main(String[] args) {
        A7_BankOperation bank = new A7_BankOperation();
        bank.initBalance();
        bank.creditAmt();
        bank.creditAmt();
        bank.debitAmt();
        bank.creditAmt();
        bank.debitAmt();
        bank.display();
    }
}
