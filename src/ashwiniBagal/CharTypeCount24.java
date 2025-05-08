package ashwiniBagal;

public class CharTypeCount24 {

	public static void main(String[] args) {
		String input = "Te2chn6o,cre-4di_T!s";
		countCharacterTypes(input);
	}

	static void countCharacterTypes(String str) {
		int upperCase = 0;
		int lowerCase = 0;
		int digits = 0;
		int specialChar = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
			upperCase++;
			}
			else if (Character.isLowerCase(ch)) {
				lowerCase++;
			}
			else if (Character.isDigit(ch)) {
				digits++;
			}
			else {
				specialChar++;
			}
		}
		System.out.println("Upper Case -> " + upperCase);
		System.out.println("lower Case -> " + lowerCase);
		System.out.println("digit -> " + digits);
		System.out.println("special Char -> " + specialChar);
	}
}
