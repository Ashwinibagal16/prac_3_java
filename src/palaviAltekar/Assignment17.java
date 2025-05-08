package palaviAltekar;

public class Assignment17 {
	
	int count;

	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		assignment17.printAllChar();
	}

	void printAllChar() {
		String input = "Techno";
		for (int i = 0; i < input.length(); i++) {
			System.out.println(i + " -> " + input.charAt(i));
		}
	}
}
