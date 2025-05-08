/*For given String, print all the characters in new line.

String input = "techno";
output :
0 → t
1 → e
2 → c
3 → h
4 → n
5 → o
6 → c*/

package pranitaPurnik;

public class Assignment17 {

	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		assignment17.printAllChar("techno");
	}

	void printAllChar(String input) {
		for (int index = 0; index <input.length(); index++) {
			char ch = input.charAt(index);
			System.out.println(index + "-->" + ch);
		}

	}

}
