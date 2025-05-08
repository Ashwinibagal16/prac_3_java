/*Problem Statement:
	Write a program that accepts a user-defined range (starting and ending number) and performs the following tasks:
	
	1. Print all numbers divisible by 7 within the range.
	2. Find and print the maximum number divisible by 7 within the range.
	3. Calculate and print the sum of all numbers divisible by 7 within the range.
	4. Calculate and print the average of numbers divisible by 7.
	
	Expected output:
		Numbers divisible by 7: 14 21 28 35 42 49
		Maximum number divisible by 7: 49
		Sum of numbers divisible by 7: 189
		Average of numbers divisible by 7: 31.5
*/

package amrutaMarkhedkar;

public class Assign16_7DivisibilityTest {

	public static void main(String[] args) {
		Assign16_7DivisibilityTest assign16_7DivisibilityTest = new Assign16_7DivisibilityTest();
		assign16_7DivisibilityTest.divisibilityTest(7, 70);
	}

	void divisibilityTest(int startRange, int endRange) {
		int count = 0;
		int max = 0;
		int sum = 0;
		System.out.print("Number divisible by 7: ");
		for (int index = startRange; index <= endRange; index++) {
			if (index % 7 == 0) {
				System.out.print(index + " ");
				max = index;
				sum += index;
				count++;
			}
		}
		System.out.println();
		System.out.println("Maximum number divisible by 7: " + max);
		System.out.println("Sum of numbers divisible by 7: " + sum);
		System.out.println("Average of numbers divisible by 7: " + (sum / count));
	}
}
