package umakantSahani;

public class Assignment18 {

	void printFrequencyOfCharacter(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println(ch + " -> " + count);
	}

	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();
		assignment18.printFrequencyOfCharacter("technocredits", 'e');
	}

}
