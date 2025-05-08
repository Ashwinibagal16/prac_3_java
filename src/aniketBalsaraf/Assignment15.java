package aniketBalsaraf;

public class Assignment15 {

	void printNumDivByFiveAndThree(int startIndex, int endIndex) {
		for (int index = startIndex; index < endIndex; index++) {
			if (index % 3 == 0 && index % 5 == 0) {
				System.out.println(index + " is div by 3 and 5 ");
			}
		}

	}

	public static void main(String[] args) {
		Assignment15 assignment15 = new Assignment15();
		assignment15.printNumDivByFiveAndThree(5, 40);
	}
}
