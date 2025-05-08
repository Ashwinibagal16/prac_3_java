package rohanNaik;

class Assignment16 {

	void processData(int startRange, int endRange) {
		int maxnum = 0;
		int sum = 0;
		int avg = 0;
		int count = 0;

		System.out.println("Numbers divisible by 7 are:");
		for (int num = startRange; num <= endRange; num++) {

			if (num % 7 == 0) {
				System.out.println(num);
				maxnum = num;
				sum = sum + num;
				count++;
			}
		}
		System.out.println("Maximum number divisible by 7:" + maxnum);
		System.out.println("Sum of number divisible by 7:" + sum);

		avg = sum / count;
		System.out.println("Average of numbers divisible by 7:" + avg);
	}

	public static void main(String args[]) {
		Assignment16 assignment16 = new Assignment16();
		assignment16.processData(10, 50);
	}
}