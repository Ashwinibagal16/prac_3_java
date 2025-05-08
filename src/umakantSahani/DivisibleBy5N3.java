package umakantSahani;

public class DivisibleBy5N3 {

	void printDivisibleBy5N3(int startIndex, int endIndex) {
		System.out.println("Divisible by 5 & 3, numbers are:");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 3 == 0 && index % 5 == 0) {
				System.out.println(index);
			}
		}
	}

	public static void main(String[] args) {
		DivisibleBy5N3 divisibleBy5N3 = new DivisibleBy5N3();
		divisibleBy5N3.printDivisibleBy5N3(5, 40);
	}

}
