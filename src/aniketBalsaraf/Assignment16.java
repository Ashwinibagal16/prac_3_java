package aniketBalsaraf;

class Assignment16 {

	int max;
	int sum;
	int avg;
	int count;

	void processData(int startIndex, int endIndex) {

		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 7 == 0) {
				System.out.println(index + " is dividible by 7");
				max = index;
				count++;
				sum = sum + index;
			}
		}
		avg = sum / count;
		System.out.println("Maximum number div by 7 is " + max);
		System.out.println("Sum of all numbers divisible by 7 is " + sum);
		System.out.println("Average of numbers divisible by 7 is " + avg);
	}

	public static void main(String[] args) {
		Assignment16 assignment16 = new Assignment16();
		assignment16.processData(10, 50);
	}
}