package chandniFatehchandani;

public class Assignment16 {

	void printNumbersDivisible(int startRange, int endRange) {
		int max = 0;
		int count = 0;
		float sum = 0;
		float avg = 0;
		
		System.out.print("Numbers divisible by 7 are : " );
		for (int num = startRange;num<=endRange; num++) {
			if(num % 7 == 0) {
				System.out.print(num + " " );
				max=num;
				count++;
				sum = sum + num;
				avg = sum / count;
			}			
		}
			System.out.println(" " + "Maximum number divisible by 7 in the given range is " + max);
			System.out.println("Sum of all numbers divisible by 7 in the given range is " + sum);
			System.out.println("Average of numbers divisible by 7 in the given range is " + avg);
	}

		public static void main (String[] args) {
			Assignment16 assignment16 = new Assignment16();
			assignment16.printNumbersDivisible(10, 50);
		}
}