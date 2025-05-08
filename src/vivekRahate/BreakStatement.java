package vivekRahate;

public class BreakStatement {
	int num;

	int firstDivisible(int startRange, int endRange) {
		for (num = startRange; num <= endRange; num++) {
			if (num % 7 == 0) {
				break;
			}

		}
		return num;

	}

	int secondtDivisible(int startRange, int endRange) {
		int count = 0;
		for (num = startRange; num <= endRange; num++) {
			if (num % 7 == 0) {
				count++;
				if (count == 2) {
					break;
				}
			}
		}
		return num;
	}

	int nthNumberDivisible(int startRange, int endRange, int nthNumber) {
		int count = 0;
		for (num = startRange; num <= endRange; num++) {
			if (num % 7 == 0) {
				count++;
				if (count == nthNumber) {
					break;
				}
			}
		}
		return num;
	}

	int lastDivisible(int startRange, int endRange) {
		for (num = endRange; num > startRange; num--) {
			if (num % 7 == 0) {
				break;
			}

		}
		return num;

	}

	int secondLasttDivisible(int startRange, int endRange) {
		int count = 0;
		for (num = endRange; num > startRange; num--) {
			if (num % 7 == 0) {
				count++;
				if (count == 2) {
					break;
				}
			}
		}
		return num;
	}

	int nthLastNumberDivisible(int startRange, int endRange, int nthNumber) {
		int count = 0;
		for (num = endRange; num > startRange; num--) {
			if (num % 7 == 0) {
				count++;
				if (count == nthNumber) {
					break;
				}
			}
		}
		return num;
	}

	public static void main(String[] args) {
		BreakStatement breakStatement = new BreakStatement();

		int firstNum = breakStatement.firstDivisible(1, 100);
		System.out.println(firstNum + " is the first number divisible by 7 in the given range");

		int secondNum = breakStatement.secondtDivisible(1, 100);
		System.out.println(secondNum + " is the second number divisible by 7 in the given range");

		int nthNum = breakStatement.nthNumberDivisible(1, 100, 4);
		System.out.println(nthNum + " is the nth number divisible by 7 in the given range");

		int lastNum = breakStatement.lastDivisible(1, 100);
		System.out.println(lastNum + " is the last number divisible by 7 in the given range");

		int secondLastNum = breakStatement.secondLasttDivisible(1, 100);
		System.out.println(secondLastNum + " is the second last number divisible by 7 in the given range");

		int nthLastNum = breakStatement.nthLastNumberDivisible(1, 100, 3);
		System.out.println(nthLastNum + " is the nth last number divisible by 7 in the given range");

	}

}
