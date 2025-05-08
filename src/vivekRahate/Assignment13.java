package vivekRahate;

public class Assignment13 {

	void findMaxNumber(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + " bigger between " + num1 + " and " + num2);
		} else {
			System.out.println(num2 + " bigger between " + num1 + " and " + num2);
		}
	}

	void findMinNumber(int num1, int num2) {
		if (num1 < num2) {
			System.out.println(num1 + " smaller between " + num1 + " and " + num2);
		} else {
			System.out.println(num2 + " smaller between " + num1 + " and " + num2);
		}
	}

	public static void main(String[] args) {
		Assignment13 assignment13 = new Assignment13();
		assignment13.findMaxNumber(300, 500);
		assignment13.findMinNumber(300, 500);
	}

}
