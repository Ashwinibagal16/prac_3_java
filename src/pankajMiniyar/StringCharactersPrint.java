//Assignment-17

package pankajMiniyar;

public class StringCharactersPrint {

	void printAllCharacters(String input) {
		int len = input.length();
		for (int index = 0; index < len; index++) {
			System.out.println(index + " --> " + input.charAt(index));
		}
	}

	public static void main(String[] args) {
		StringCharactersPrint stringCharactersPrint = new StringCharactersPrint();
		stringCharactersPrint.printAllCharacters("techno");
	}
}
