package jyotiSukhwal;

public class PrintFrequency {
	
	void printCharFrequency() {
		String input = "technocredits";
		int count = 0;
		for (int index=0 ; index<input.length() ; index++) {
			if(input.charAt(index) == 'e') {
				count ++ ; 
			}
		}
		System.out.println("Frequency of char e is : " + count );
	}

	public static void main(String[] args) {
		PrintFrequency printFrequency = new PrintFrequency();
		printFrequency.printCharFrequency();
	}
}

/* 
On user defined String, print frequency of char e.

String input = "technocredits";
output : e → 2
*/