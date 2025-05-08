package vivekDhole;

public class Assignment18 {

	String input = "technocredits";
	int count;

	void printCharFreq(String input) {
		int len = input.length();
		for (int index = 0; index < len; index++) {
			char ch = input.charAt(index);
			if (ch == 'e') {
				count++;
			}
		}
		System.out.println("Frequency of character e is " + count);
	}

	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();
		assignment18.printCharFreq(assignment18.input);
	}

}
