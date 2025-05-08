package siddheshParab;

class A2_Bank {

    // Instance variable to hold the balance
    int balance = 1000;  // Initial balance is 1000 rs

    // Method to debit 500 rs from the balance
    void debitAmt() {
        balance -= 500;  // Subtracting 500 rs from the balance
    }

    // Method to credit 200 rs to the balance
    void creditAmt() {
        balance += 200;  // Adding 200 rs to the balance
    }

    // Method to print the current balance
    void printBalance() {
        System.out.println("Remaining balance is " + balance);  // Print the balance
    }

    public static void main(String[] args) {
        // Create an object of the A2_Bank class
        A2_Bank bank = new A2_Bank();

        // Perform operations as per the input sequence
        bank.debitAmt();     // Debit 500 rs
        bank.creditAmt();    // Credit 200 rs
        bank.creditAmt();    // Credit 200 rs
        bank.printBalance(); // Print the balance after these operations
        bank.creditAmt();    // Credit 200 rs
        bank.printBalance(); // Print the balance after this operation
        bank.debitAmt();     // Debit 500 rs
        bank.printBalance(); // Print the balance after this operation
    }
}
