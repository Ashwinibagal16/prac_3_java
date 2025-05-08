package krupa;

public class PrintEvenNumber {
	
	void printEvenNum(int startNum, int endNum) {
		for(int num=startNum; num<=endNum; num++) {
			if(num%2==0) {
				System.out.println(num + " is even number");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintEvenNumber evenNum = new PrintEvenNumber();
		evenNum.printEvenNum(10, 15);
	}

}
