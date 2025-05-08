package jyotiSukhwal;

public class StringPrint {

	void printString() {
		String input = "technoc";
		for (int index = 0; index < input.length(); index++) {
			System.out.println("Char at index " + index + " is : " + input.charAt(index));
		}
	}

	public static void main(String[] args) {
		StringPrint stringPrint = new StringPrint();
		stringPrint.printString();
	}

}

/*
 * For given String, print all the characters in new line.
 * 
 * String input = "techno"; output : 0 → t 1 → e 2 → c 3 → h 4 → n 5 → o 6 → c
 */