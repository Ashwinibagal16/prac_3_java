package umakantSahani;

public class Assignment17 {

	void printAllCharacters(String input) {
		for (int index = 0; index < input.length(); index++) {
			System.out.println(index + " -> " + input.charAt(index));
		}
	}

	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		assignment17.printAllCharacters("techno");
	}
}
