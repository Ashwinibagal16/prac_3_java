package pankajMiniyar;

public class StringPrintFrequency {

	void printCharFrequency(String input) {
		int count = 0;
		int len = input.length();
		for (int index = 0; index < len; index++) {
			if (input.charAt(index) == 'e') {
				count++;
			}
		}
		System.out.println("e--> " + count);
	}

	public static void main(String[] args) {
		StringPrintFrequency stringPrintFrequency = new StringPrintFrequency();
		stringPrintFrequency.printCharFrequency("technocredits");
	}
}
