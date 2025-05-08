package ashwiniBagal;

import java.util.Scanner;

public class DivisibleBy19 {

	int firstDivisibleBy(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (i % 7 == 0)
				return i;
		}
		return -1;
	}

	int secondDivisibleBy(int start, int end) {
		int count = 0;
		for (int i = start; i <= end; i++) {
			if (i % 7 == 0)
				count++;
			if (count == 2)
				return i;
		}

		return -1;
	}

	int nthDivisibleBy(int start, int end, int n) {
		int count = 0;
		for (int i = start; i <= end; i++) {
			if (i % 7 == 0)
				count++;
			if (count == n)
				return i;
		}

		return -1;
	}

	int lastDivisibleBy(int start, int end) {
		for (int i = end; i >= start; i--) {
			if (i % 7 == 0)
				return i;
		}
		return -1;
	}

	int secondLastDivisibleBy(int start, int end) {
		int count = 0;
		for (int i = end; i >= start; i--) {
			if (i % 7 == 0)
				count++;
			if (count == 2)
				return i;
		}

		return -1;
	}

	int nthLastDivisibleBy(int start, int end, int n) {
		int count = 0;
		for (int i = end; i >= start; i--) {
			if (i % 7 == 0)
				count++;
			if (count == n)
				return i;
		}

		return -1;
	}

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		DivisibleBy19 obj = new DivisibleBy19();
		System.out.print("Enter start of range = ");
		int start = sc.nextInt();
		System.out.print("Enter end of range = ");
		int end = sc.nextInt();
		System.out.println("Enter First Divisible by 7: " + obj.firstDivisibleBy(start, end));
		System.out.println("Enter Second Divisible by 7: " + obj.secondDivisibleBy(start, end));
		System.out.println("Enter 4th Divisible by 7: " + obj.nthDivisibleBy(start, end, 4));
		System.out.println("Enter Last Divisible by 7: " + obj.lastDivisibleBy(start, end));
		System.out.println("Enter Second Last Divisible by 7: " + obj.secondLastDivisibleBy(start, end));
		System.out.println("Enter 3rd Last Divisible by 7: " + obj.nthLastDivisibleBy(start, end, 3));

	}

}
