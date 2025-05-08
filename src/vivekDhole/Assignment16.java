package vivekDhole;

class Assignment16 {

	void printDiv(int startRange, int endRange) {

		int max = 0;
		int sum = 0;
		int count = 0;
		int avg = 0;

		for(int num = startRange; num <= endRange; num++) {
			if(num % 7 == 0) {
				System.out.println(" Numbers divisible by 7 : " +num);
				max = num;
				count++;
				sum = sum + num;
				avg = sum / count;
			}
		}
			System.out.println("Maximum number divisible by 7 :" +max);
			System.out.println("Sum of numbers divisible by 7 :" +sum);
			System.out.println("Average of numbers divisible by 7 :" +avg);
	}	


	public static void main(String[] args) {
		Assignment16 assignment16 = new Assignment16();
		assignment16.printDiv(10,50);
	}			
}	