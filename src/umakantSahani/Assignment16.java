package umakantSahani;

public class Assignment16 {

	void divisbleNumbersSumAvgAndCount(int startIndex, int endIndex, int divider) {
		int max = 0;
		int sum = 0;
		int count = 0;
		System.out.print("Numbers divisible by " + divider + ": ");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % divider == 0) {
				System.out.print(index + " ");
				max = index;
				sum += index;
				count++;
			}
		}
		System.out.println();
		System.out.println("Maximum number divisible by " + divider + ": " + max);
		System.out.println("Sum of numbers divisible by " + divider + ": " + sum);
		System.out.println("Average of numbers divisible by " + divider + ": " + ((float)sum / count));
	}

	public static void main(String[] args) {
		Assignment16 assignment16 = new Assignment16();
		assignment16.divisbleNumbersSumAvgAndCount(10, 50, 7);
	}

}
