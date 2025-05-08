package pranitaPurnik;

public class Assignment16 {

	void printNumDivisibleBy7(int startNum, int endNum) {
		int max = 0;
		float sum = 0;
		int count = 0;
		System.out.println("List of Numbers Divisible by 7 are:- ");
		for (int i = startNum; i <= endNum; i++) {
			if (i % 7 == 0) {
				max = i;
				count++;
				sum = sum + i;
				System.out.print(i + " ");
			}
		}
		System.out.println("/n");
		float average = sum / count;
		System.out.println("Maximum number divisible by 7 is- " + max);
		System.out.println("Sum of all numbers divisible by 7 is- " + sum);
		System.out.println("Average of numbers divisible by 7 is " + average);

	}

	public static void main(String[] args) {
		Assignment16 assignment16 = new Assignment16();
		assignment16.printNumDivisibleBy7(10, 50);
	}

}
