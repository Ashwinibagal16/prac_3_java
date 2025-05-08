package shubhamMandavgane;

public class PrintFreqCharE {
	
	void PrintFreqChare(String input) {
		int count= 0;
		for (int index = 0 ; index<input.length(); index++) {
			if(input.charAt(index)=='e'){
				count++;
			}
		}
		System.out.println("e --> " +count);
	}

	public static void main(String[] args) {
		PrintFreqCharE printfreqchare= new PrintFreqCharE();
		printfreqchare.PrintFreqChare("technocredits");

	}

}
