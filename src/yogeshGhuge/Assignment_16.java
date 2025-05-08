package yogeshGhuge;

public class Assignment_16 {
	int max = 0;
	int count = 0;
	int sum;

	// float avg = (sum/count);
	void PrintNumber(int start, int end) {
		for (int num = start; num <= end; num++) {

			if (num % 7 == 0) {
				max = num;
				System.out.println(num);
				count++;
				sum = sum + num;
			}

		}
		System.out.println("Maximum number divisible by 7: " + max);
		System.out.println(count);
		System.out.println("Average of number : " + (float)sum / count);
	}

	public static void main(String[] args) {
		Assignment_16 numberDiv = new Assignment_16();
		numberDiv.PrintNumber(10, 50);
	}
}

/*
 * Problem Statement:
 * 
 * Write a program that accepts a user-defined range (starting and ending
 * number) and performs the following tasks:
 * 
 * 1. Print all numbers divisible by 7 within the range. 2. Find and print the
 * maximum number divisible by 7 within the range. 3. Calculate and print the
 * sum of all numbers divisible by 7 within the range. 4. Calculate and print
 * the average of numbers divisible by 7.
 * 
 * 
 * Input:
 * 
 * Two integers from the user: start and end (start of the range and end of the
 * range).
 * 
 * Output:
 * 
 * List of numbers divisible by 7. Maximum number divisible by 7. Sum of all
 * numbers divisible by 7. Average of numbers divisible by 7.
 */
