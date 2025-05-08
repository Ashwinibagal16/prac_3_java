package ashwiniBagal;

public class DuplicateChar21 {

	public static void main(String[] args) {
		String input = "technocredits";
		printDuplicateChar21(input);
	}

	static void printDuplicateChar21(String str) {
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (str.indexOf(ch) != str.lastIndexOf(ch)) {
				System.out.println(ch);
			}
		}
	}


}
