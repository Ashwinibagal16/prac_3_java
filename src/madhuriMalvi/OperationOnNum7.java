/*Write a program that accepts a user-defined range (starting and ending number) and performs the following tasks:

1. Print all numbers divisible by 7 within the range.
2. Find and print the maximum number divisible by 7 within the range.
3. Calculate and print the sum of all numbers divisible by 7 within the range.
4. Calculate and print the average of numbers divisible by 7.*/

package madhuriMalvi;

public class OperationOnNum7 {
	void printNumDiv7(int startNum, int endNum) {
		for (int num = startNum; num <= endNum; num++) {
			if (num % 7 == 0) {
				System.out.println(num);
			}
		}
	}

	void printMaxNumDiv7(int startNum, int endNum) {
		int max = 0;
		for (int num = startNum; num <= endNum; num++) {
			if (num % 7 == 0) {
				if (num >= max) {
					max = num;
				}
			}
		}
		System.out.println("Maximum number divisible by 7 within the range is " + max);
	}

	void printSumOfNumDiv7(int startNum, int endNum) {
		int sum = 0;
		for (int num = startNum; num <= endNum; num++) {
			if (num % 7 == 0) {
				sum = sum + num;
			}
		}
		System.out.println("Sum of all numbers  divisible by 7 within the range is " + sum);
	}

	void printAvgOfNumDiv7(int startNum, int endNum) {
		int sum = 0;
		int count = 0;
		int avg = 0;
		for (int num = startNum; num <= endNum; num++) {
			if (num % 7 == 0) {
				count++;
				sum = sum + num;
			}
		}
		avg = sum / count;
		System.out.println("Average of all numbers  divisible by 7 within the range is " + avg);
	}

	public static void main(String[] args) {
		OperationOnNum7 operationOnNum7 = new OperationOnNum7();
		operationOnNum7.printNumDiv7(10, 50);
		operationOnNum7.printMaxNumDiv7(10, 50);
		operationOnNum7.printSumOfNumDiv7(10, 50);
		operationOnNum7.printAvgOfNumDiv7(10, 50);
	}
}
