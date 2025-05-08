package vivekRahate;

public class Assignment17 {

	void printFrequncyChar(String input) {

		for (int i = 0; i < input.length(); i++) {
			System.out.println(i + "-->" + input.charAt(i));

		}

	}

	public static void main(String[] args) {
		Assignment17 assignmen17 = new Assignment17();
		assignmen17.printFrequncyChar("technocredits");

	}

}
