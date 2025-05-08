package vivekRahate;

public class Assignment16 {

	int max;
	int sum;
	int count = 0;
	float avg;

	void divisibleTest(int start, int end) {

		for (int i = start; i <= end; i++) {
			if (i % 7 == 0) {
				System.out.println("Numbers divisible by 7 = " + i);
				max = i;
				count++;
				sum = sum + i;

			}

		}
		System.out.println("Maximum number divisible by 7:" + max);
		System.out.println("Sum of numbers divisible by 7:" + sum);
		System.out.println(count);
		avg = sum / count;
		System.out.println("Average of numbers divisible by 7: " + avg);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment16 assignment16 = new Assignment16();
		assignment16.divisibleTest(10, 50);

	}

}
