package yogeshGhuge;

class Assignment8 {
    int balance;

    void intialBalance(int amount) {
        balance = amount;
        System.out.println("Initial balance is: " + balance);
    }

    void debit(int amnt) {
        if (balance >= amnt) {
            balance = balance - amnt;
            System.out.println(amnt + " Debited. Total balance is: " + balance);
        } else {
            System.out.println("Insufficient balance");
            System.out.println("Remaining balance is: " + balance);
        }
    }

    void credit(int amnt) {
        balance = balance + amnt;
        System.out.println(amnt + " Credited. Current balance: " + balance);
    }

    public static void main(String[] args) {
        Assignment8 BankOperation = new Assignment8();
        BankOperation.intialBalance(5000);
        BankOperation.credit(1000);
        BankOperation.debit(2000);
        BankOperation.debit(200);
    }
}

