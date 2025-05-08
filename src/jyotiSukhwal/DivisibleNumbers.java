package jyotiSukhwal;

public class DivisibleNumbers {

	void printNumbers(int startIndex, int endIndex) {
		System.out.println(" Divisible by 5 & 3, numbers are: ");
		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		DivisibleNumbers divisibleNumbers = new DivisibleNumbers();
		int startIndex = 5;
		int endIndex = 40;
		divisibleNumbers.printNumbers(startIndex, endIndex);
	}

}

/*
 * In the given range 5 to 40, print all numbers which are divisible by 5 and
 * divisible by 3. Hint : pass start and end index as a parameter.
 * 
 * Output : Divisible by 5 & 3, numbers are: 15 30
 */
