package ashwiniBagal;

public class Uniquechar20 {

	public static void main(String[] args) {
		String input = "technocredits";
		printUniquechar20(input);
	}

	static void printUniquechar20(String str) {
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
	}

}
