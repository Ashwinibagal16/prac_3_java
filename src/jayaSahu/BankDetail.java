package jayaSahu;

class BankDetail{
    int balance = 1000;
    int debitCount = 0;
    int creditCount = 0;
    int printStatementCount = 0;
	
    void debitAmt() {
        balance = balance-200;
        debitCount++;
    }
	
    void creditAmt() {
        balance = balance+400;
        creditCount++;
    }
	
    void printStatement() {
        System.out.println("remaining balance is " + balance);
        printStatementCount++;
    }

    void printCountInfo() {
        System.out.println("debit method call count -> " + debitCount);
        System.out.println("credit method call count -> " + creditCount);
        System.out.println("printstatment method call count -> " + printStatementCount);
    }

    public static void main(String[] args) {
        BankDetail bd = new BankDetail();
        bd.debitAmt();
        bd.creditAmt();
        bd.creditAmt();
        bd.creditAmt();
        bd.printStatement();
        bd.printCountInfo();
    }

}