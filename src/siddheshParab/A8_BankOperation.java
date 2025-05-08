package siddheshParab;

class A8_BankOperation {
    private int balance;

    // Method to initialize balance
    public void initBalance(int amount) {
        balance = amount;
        System.out.println("Balance has been initialized with " + amount + " rs.");
    }

    // Method to credit amount
    public void creditAmt(int amt) {
        balance += amt;
        System.out.println(amt + " rs has been credited.");
    }

    // Method to debit amount
    public void debitAmt(int amt) {
        if (amt > balance) {
            System.out.println("In Sufficient balance, your ask is " + amt + " rs but you only have " + balance + " rs.");
        } else {
            balance -= amt;
            System.out.println(amt + " rs has been debited.");
        }
    }

    // Method to display current balance
    public void display() {
        System.out.println("Your current balance is " + balance + " rs.");
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        A8_BankOperation account = new A8_BankOperation();
        
        // Calling the sequence as per the instructions
        account.initBalance(5000);
        account.creditAmt(2000);
        account.creditAmt(500);
        account.debitAmt(9500);
        account.creditAmt(1500);
        account.debitAmt(6000);
        account.display();
    }
}
