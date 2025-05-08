package vidyaPatil;

public class StringPrintAllChar {

	void printAllChar(String input) {
		System.out.println("String characters are :");
		for (int index = 0; index < input.length(); index++) {
			System.out.println(index + " -> " + input.charAt(index));
		}
	}

	public static void main(String[] args) {

		StringPrintAllChar stringPrintAllChar = new StringPrintAllChar();
		stringPrintAllChar.printAllChar("Techno");

	}

}
