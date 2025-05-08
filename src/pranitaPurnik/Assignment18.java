/*On user defined String, print frequency of char e.

String input = "technocredits";
output : e → 2
*/
package pranitaPurnik;

public class Assignment18 {

	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();
		assignment18.printCharFreq("technocredits", 'e');

	}

	void printCharFreq(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			// char c = input.charAt(index);
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println(ch + "-->" + count);
	}

}
