package palaviAltekar;

public class Assignment_16 {

	public static void main(String[] args) {
		Assignment_16 assignment = new Assignment_16();
		assignment.division(10, 50);

	}
	
	void division (int startNum, int endNum) {
		String strOutput = "Numbers divisible by 7 : ";
		int sumOfAll = 0;
		int maxNum = 0;
		int count = 0;
		for(int i = startNum; i<=endNum; i++ ) {
			if (i % 7 == 0) {
				strOutput = strOutput + i + ", ";
				sumOfAll = sumOfAll + i;
				count++;
				if (i > maxNum) {
					maxNum = i;
				}
			}
		}
		System.out.println(strOutput);
		System.out.println("Sum of numbers divisible by 7:" + sumOfAll);
		System.out.println("Maximum number divisible by 7: " + maxNum);
		System.out.println("Average of numbers divisible by 7: " + sumOfAll/count);
	}

}
