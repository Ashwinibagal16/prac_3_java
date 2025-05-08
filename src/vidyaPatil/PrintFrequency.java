package vidyaPatil;

public class PrintFrequency {

	void printFrequency(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == 'e') {
				count++;
			}
		}

		System.out.println("In " + input + " string " + "frequency of char e is " + count);

	}
	
	public static void main(String[] args) {
		PrintFrequency printFrequency = new PrintFrequency();
		printFrequency.printFrequency("Technocredits");
		printFrequency.printFrequency("elephant");
		printFrequency.printFrequency("heights");
	}
}
