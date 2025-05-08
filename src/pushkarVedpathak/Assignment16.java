package pushkarVedpathak;

public class Assignment16 {

	void processData(int startRange, int endRange) {
		int maxNum = 0;
		int total = 0;
		int count = 0;
		System.out.print("Numbers divisible by 7 are: ");
		for (int num = startRange; num <= endRange; num++) {
			if (num % 7 == 0) {
				maxNum = num;
				count++;
				total = total + num;
				System.out.print(num + " ");
			}
		}
		System.out.println();
		System.out.println("Maximum number divisible by 7 is: " + maxNum);
		System.out.println("Sum of all the numbers divisible by 7 is: " + total);
		System.out.println("Average of numbers divisible by 7 is: " + (total / count));
	}

	public static void main(String[] args) {
		Assignment16 div7 = new Assignment16();
		div7.processData(10, 50);
	}
}