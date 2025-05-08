/*Assignment - 18 : 29th April'2025
On user defined String, print frequency of char e.

String input = "technocredits";
output : e -> 2*/
package amrutaMarkhedkar;

public class Assignment18 {

	void printCharFreq(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == 'e')
				count++;
		}
		System.out.println("e -> " + count);
	}

	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();
		String input = "technocredits";

		assignment18.printCharFreq(input);
	}
}
