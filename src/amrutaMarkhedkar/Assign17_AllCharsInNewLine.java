/*For given String, print all the characters in new line.

String input = "techno";
output :
0 → t
1 → e
2 → c
3 → h
4 → n
5 → o
6 → c
*/

package amrutaMarkhedkar;

public class Assign17_AllCharsInNewLine {

	public static void main(String[] args) {
		Assign17_AllCharsInNewLine assign17_AllCharsInNewLine = new Assign17_AllCharsInNewLine();
		String input = "techno";
		assign17_AllCharsInNewLine.printChars(input);

	}

	void printChars(String input) {
		for (int index = 0; index < input.length(); index++) {
			System.out.println(input.charAt(index));
		}
	}

}
