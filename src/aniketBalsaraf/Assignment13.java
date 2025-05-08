package aniketBalsaraf;

public class Assignment13 {

	void printMaxNumber(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + " is max number");
		} else {
			System.out.println(num2 + " is max number");
		}

	}
	
	void printMinNumber(int num1, int num2) {
		if (num1 < num2) {
			System.out.println(num1 + " is max number");
		} else {
			System.out.println(num2 + " is max number");
		}

	}

	public static void main(String[] args) {
		Assignment13 assignment13 = new Assignment13();
		assignment13.printMaxNumber(17, 10);
		assignment13.printMinNumber(17, 10);

	}

}
