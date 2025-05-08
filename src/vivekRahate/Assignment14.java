package vivekRahate;

public class Assignment14 {

	void printEven(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				System.out.println("Even number is = " + i);
			}
		}
	}

	public static void main(String[] args) {
		Assignment14 assignment14 = new Assignment14();
		assignment14.printEven(10, 15);
	}
}