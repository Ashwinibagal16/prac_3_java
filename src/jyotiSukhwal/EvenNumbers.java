package jyotiSukhwal;

public class EvenNumbers {

	void printEvenNumber(int startIndex, int endIndex) {
		System.out.println("Even numbers are: ");
		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		EvenNumbers evenNumbers = new EvenNumbers();
		int startIndex = 10;
		int endIndex = 15;
		evenNumbers.printEvenNumber(startIndex, endIndex);
	}

}

/*
 * Write only one program having the following methods. print all even numbers
 * in a range 10 to 15. Hint : pass start and end index as a parameter. Output :
 * Even numbers are: 10 12 14
 */