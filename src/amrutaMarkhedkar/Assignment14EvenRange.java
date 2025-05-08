/*Write only one program having the following methods.
print all even numbers in a range 10 to 15.
Hint : pass start and end index as a parameter.
Output : Even numbers are:
10
12
14
*/

package amrutaMarkhedkar;

public class Assignment14EvenRange {

	public static void main(String[] args) {
		Assignment14EvenRange assignment14EvenRange = new Assignment14EvenRange();
		assignment14EvenRange.getAllEvenNumbers(10, 15);
	}

	void getAllEvenNumbers(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0) {
				System.out.println(index);
			}
		}

	}

}
