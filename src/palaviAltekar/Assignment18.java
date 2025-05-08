package palaviAltekar;

public class Assignment18 {
	int count;

	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();
		assignment18.printMaxLetterCount("technocredits");

	}
	
	void printMaxLetterCount(String input) {
		for (int i = 0; i < input.length(); i++) {
			char test = input.charAt(i);
			if (test == 'e') {
				count++;
			}
		}
		System.out.println("e" + " ->  " + count);
	}

}
