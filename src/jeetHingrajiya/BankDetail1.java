//Assignment 6
package jeetHingrajiya;
class BankDetail1 {
    int debitCount;
    int creditCount;
    int printStatementCount;

    static int totalDebitCount;
    static int totalCreditCount;
    static int totalPrintStatementCount;

    void debitAmt() {
        debitCount=debitCount+1;
        totalDebitCount=totalDebitCount+1;
    }

    void creditAmt() {
        creditCount=creditCount+1;
        totalCreditCount= totalCreditCount +1;
    }

    void printStatement() {
        printStatementCount= printStatementCount+1;
        totalPrintStatementCount= totalPrintStatementCount+1;
    }

    void printCountInfo() {
        System.out.println("Debit method call count -> " + debitCount);
        System.out.println("Credit method call count -> " + creditCount);
        System.out.println("Print Statement method call count -> " + printStatementCount);
        System.out.println();
    }

    static void printAllCountInfo() {
        System.out.println("Total debit operations -> " + totalDebitCount);
        System.out.println("Total credit operations -> " + totalCreditCount);
        System.out.println("Total print statement operations -> " + totalPrintStatementCount);
    }

    public static void main(String[] args) {
        BankDetail1 bank_1 = new BankDetail1();
        bank_1.debitAmt();
        bank_1.creditAmt();
        bank_1.creditAmt();
        bank_1.creditAmt();
		bank_1.printStatement();
        bank_1.printCountInfo();    

        BankDetail1 bank_2 = new BankDetail1();
        bank_2.creditAmt(); 
        bank_2.printStatement();
        bank_2.printStatement();
        bank_2.printStatement();
        bank_2.printCountInfo();

        bank_1.printAllCountInfo();
		
    }
}
