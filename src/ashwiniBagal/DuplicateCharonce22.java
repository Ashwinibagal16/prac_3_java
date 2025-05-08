package ashwiniBagal;

public class DuplicateCharonce22 {

	public static void main(String[] args) {
		String input = "technocredits";
		String output = getDuplicateCharacters(input);
		 System.out.println("Output: " + output);
	}

	static String getDuplicateCharacters(String str) {
		str = str.toLowerCase();
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (str.indexOf(ch) != str.lastIndexOf(ch) && result.indexOf(ch) == -1) {
			result += ch;
			}
		}
		return result;
	}
}
