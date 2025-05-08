package najneenMalgave;

public class CharFrequency {

	void printFrequency(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == 'e') {
				count++;
			}
		}

		System.out.println("frequency of char e --> " + count);

	}

	public static void main(String[] args) {
		CharFrequency CharFrequency = new CharFrequency();
		CharFrequency.printFrequency("Technocredits");
		CharFrequency.printFrequency("Najneen");
		CharFrequency.printFrequency("Malgave");
	}
}