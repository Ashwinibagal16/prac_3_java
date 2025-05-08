package krupa;

public class PrintDivisibleNumber {
	
	void printDivisibleNum(int startRange, int endRange) {
		for(int num=startRange; num<=endRange; num++) {
			if(num%3==0 && num%5==0) {
				System.out.println(num + " is divisible by 5 & 3");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintDivisibleNumber divisibleNum = new PrintDivisibleNumber();
		divisibleNum.printDivisibleNum(5, 40);
	}

}
