/*In the given range 5 to 40, print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.

Output : Divisible by 5 & 3, numbers are:
15
30
*/
package amrutaMarkhedkar;

public class Assign15_DivisibilityTest {

	public static void main(String[] args) {
		Assign15_DivisibilityTest assign15_DivisibilityTest = new Assign15_DivisibilityTest();
		assign15_DivisibilityTest.divisibilityTest(5, 40);
	}

	void divisibilityTest(int startIndex, int endIndex) {
		System.out.println("Divisible by 5 & 3, numbers are: ");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 3 == 0 && index % 5 == 0) {
				System.out.println(index);
			}
		}
	}

}
