/* Assignment: Working with Numbers Divisible by 7

Problem Statement:

Write a program that accepts a user-defined range (starting and ending number) and performs the following tasks:

1. Print all numbers divisible by 7 within the range.
2. Find and print the maximum number divisible by 7 within the range.
3. Calculate and print the sum of all numbers divisible by 7 within the range.
4. Calculate and print the average of numbers divisible by 7.


Input:

* Two integers from the user: start and end (start of the range and end of the range).

Output:

* List of numbers divisible by 7.
* Maximum number divisible by 7.
* Sum of all numbers divisible by 7.
* Average of numbers divisible by 7.


Example:

Input:

Enter start of range: 10
Enter end of range: 50




Output:

Numbers divisible by 7: 14 21 28 35 42 49
Maximum number divisible by 7: 49
Sum of numbers divisible by 7: 189
Average of numbers divisible by 7: 31.5
*/

package priyankaZende;

public class NumDivBy7Assg16 {

	// Print all numbers divisible by 7 within the range.
	void printNumDivBy7(int startRange, int endRange) {
		System.out.println("Print all numbers divisible by 7 within the range:");
		for (int index = startRange; index < endRange; index++) {
			if (index % 7 == 0) {
				System.out.print(index +"\t");
			}
		}
	}

	// Find and print the maximum number divisible by 7 within the range.
	void maxNumDivBy7(int startRange, int endRange) {
		System.out.println("\nPrint the maximum number divisible by 7 within the range:");
		for (int index = endRange; index > startRange; index--) {
			if (index % 7 == 0) {
				System.out.println(index);
				break;
			}
		}
	}

	// Calculate and print the sum of all numbers divisible by 7 within the range.
	void printSumOfAllNumDivBy7(int startRange, int endRange) {
		int sum = 0;
		System.out.println("Calculate and print the sum of all numbers divisible by 7 within the range:");
		for (int index = startRange; index < endRange; index++) {
			if (index % 7 == 0) {
				sum += index;
			}
		}
		System.out.println(sum);
	}

	// Calculate and print the average of numbers divisible by 7.
	void printAvgOfAllNumDivBy7(int startRange, int endRange) {
		double sum = 0;
		int totalNum = 0;
		double avg = 0;
		System.out.println("Calculate and print the average of numbers divisible by 7:");
		for (int index = startRange; index < endRange; index++) {
			if (index % 7 == 0) {
				sum += index;
				totalNum++;
			}
		}
		avg = (sum / totalNum);
		System.out.println(avg);
	}

	public static void main(String[] args) {
		NumDivBy7Assg16 numDivBy7Assg16 = new NumDivBy7Assg16();
		int startRange = 10;
		int endRange = 50;

		System.out.println("Enter start of range: " + startRange);
		System.out.println("Enter end of range: " + endRange);

		numDivBy7Assg16.printNumDivBy7(startRange, endRange);
		numDivBy7Assg16.maxNumDivBy7(startRange, endRange);
		numDivBy7Assg16.printSumOfAllNumDivBy7(startRange, endRange);
		numDivBy7Assg16.printAvgOfAllNumDivBy7(startRange, endRange);
	}
}
