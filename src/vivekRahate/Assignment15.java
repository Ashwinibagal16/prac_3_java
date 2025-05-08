package vivekRahate;

public class Assignment15 {

	void findDivisibleNumber(int start, int end) {
		for (int i = start; i < end; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println(i);
			}
		}

	}

	public static void main(String[] args) {
		Assignment15 assignment15 = new Assignment15();
		System.out.println("Divisible by 5 & 3, numbers :");
		assignment15.findDivisibleNumber(5, 40);

	}
}
