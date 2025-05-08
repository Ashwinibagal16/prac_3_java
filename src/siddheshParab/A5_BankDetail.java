package siddheshParab;

class A5_BankDetail {

    // Instance variables
    int balance = 1000;
    int debitCount = 0;
    int creditCount = 0;
    int printStatementCount = 0;

    // Method to debit amount (deducts 200 from balance)
    void debitAmt() {
        balance -= 200;  // Deduct 200 from the balance
        debitCount++;    // Increment debit count
    }

    // Method to credit amount (adds 400 to balance)
    void creditAmt() {
        balance += 400;  // Add 400 to the balance
        creditCount++;   // Increment credit count
    }

    // Method to print the current balance
    void printStatement() {
        System.out.println("Remaining balance is " + balance);
        printStatementCount++;  // Increment print statement count
    }

    // Method to print how many times each method has been called
    void printCountInfo() {
        System.out.println("debit method call count -> " + debitCount);
        System.out.println("credit method call count -> " + creditCount);
        System.out.println("printStatement method call count -> " + printStatementCount);
    }

    // Main method to call methods in the required sequence
    public static void main(String[] args) {
        A5_BankDetail bank = new A5_BankDetail();

        // Call methods in the specified order
        bank.debitAmt();  // Deducts 200 from balance, debit count is 1
        bank.creditAmt(); // Adds 400 to balance, credit count is 1
        bank.creditAmt(); // Adds 400 to balance, credit count is 2
        bank.creditAmt(); // Adds 400 to balance, credit count is 3
        bank.printStatement(); // Prints remaining balance, print statement count is 1

        // Print method call counts
        bank.printCountInfo(); // Displays method call counts
    }
}
