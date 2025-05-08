package vivekDhole;

public class Assignment17 {

	String input = "techno";

	void printAllChar(String input) {

		int len = input.length();
		System.out.println("Length of the String " + input + " is " + len);

		for (int index = 0; index < len; index++) {
			char ch = input.charAt(index);
			System.out.println(index + "---->" + ch);
		}

	}

	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		assignment17.printAllChar(assignment17.input);
	}

}
