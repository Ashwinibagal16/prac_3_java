package umakantSahani;

public class EvenNumbers {

	void printEvenNumber(int startIndex, int endIndex) {
		System.out.println("Even Numbers are:");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0) {
				System.out.println(index);
			}
		}
	}

	public static void main(String[] args) {
		EvenNumbers evenNumbers = new EvenNumbers();
		evenNumbers.printEvenNumber(10, 15);
	}

}
