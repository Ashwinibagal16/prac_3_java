package siddheshParab;

class A6_BankDetail {

    // Instance variables to track method calls for each object
    int debitCount = 0;
    int creditCount = 0;
    int printStatementCount = 0;

    // Static variables to track method calls across all objects
    static int totalDebitCount = 0;
    static int totalCreditCount = 0;
    static int totalPrintStatementCount = 0;

    // Method to debit amount (deduct 200 from balance) and increment counts
    void debitAmt() {
        debitCount++;           // Increment debit count for this object
        totalDebitCount++;      // Increment total debit count globally
    }

    // Method to credit amount (add 400 to balance) and increment counts
    void creditAmt() {
        creditCount++;          // Increment credit count for this object
        totalCreditCount++;     // Increment total credit count globally
    }

    // Method to print the current balance (not implemented but could be added)
    void printStatement() {
        printStatementCount++;  // Increment print statement count for this object
        totalPrintStatementCount++; // Increment total print statement count globally
    }

    // Method to print how many times each method has been called for the current object
    void printCountInfo() {
        System.out.println("debit method call count -> " + debitCount);
        System.out.println("credit method call count -> " + creditCount);
        System.out.println("printStatement method call count -> " + printStatementCount);
    }

    // Method to print how many times each method has been called across all objects
    static void printAllCountInfo() {
        System.out.println("total debit Operations -> " + totalDebitCount);
        System.out.println("total credit Operations -> " + totalCreditCount);
        System.out.println("total printstatement Operations -> " + totalPrintStatementCount);
    }

    public static void main(String[] args) {
        // Create two A6_BankDetail objects
        A6_BankDetail bank1 = new A6_BankDetail();
        A6_BankDetail bank2 = new A6_BankDetail();

        // Perform operations on the first object
        bank1.debitAmt();   // debit count for bank1 is 1
        bank1.creditAmt();  // credit count for bank1 is 1
        bank1.creditAmt();  // credit count for bank1 is 2
        bank1.creditAmt();  // credit count for bank1 is 3
        bank1.printStatement();  // print statement count for bank1 is 1

        // Perform operations on the second object
        bank2.creditAmt();  // credit count for bank2 is 1
        bank2.printStatement();  // print statement count for bank2 is 1
        bank2.printStatement();  // print statement count for bank2 is 2
        bank2.printStatement();  // print statement count for bank2 is 3

        // Print individual counts for each object
        bank1.printCountInfo();
        bank2.printCountInfo();

        // Print total counts across all objects
        A6_BankDetail.printAllCountInfo();
    }
}

