package suchetaGhogare;

public class Assignment16 {
	int max;
	int count;
	int avg;
	int sum;
	
	void verifyDivision(int startRange, int endRange) {
		System.out.println("Numbers divisible by 7 are: ");
		for (int num=startRange; num<=endRange; num++) {
			if (num%7==0) {
				max = num;
				count ++;	
				sum = sum + num;
				avg = sum / count;
				System.out.println(num);
			}
		}
		System.out.println("Max.number divisible by 7 is: " +max);
		System.out.println("Total numbers divisible by 7 are: " +count);
		System.out.println("Sum of numbers divisible by 7 is: " +sum);
		System.out.println("Average of numbers divisible by 7 is: " +avg);
	}	
	
	public static void main(String[] args) {
		Assignment16 assignment16 = new Assignment16();
		assignment16.verifyDivision(1,50);
	}
}
