package anushreePatra;

public class AllCharacter {
	String input = "techno";

	void printAllChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			System.out.println(index + "->" + input.charAt(index));
		}
	}

	public static void main(String[] args) {
		AllCharacter allCharacter = new AllCharacter();
		allCharacter.printAllChar(allCharacter.input);

	}

}
