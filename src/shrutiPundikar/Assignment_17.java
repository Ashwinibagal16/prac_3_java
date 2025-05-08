package shrutiPundikar;

public class Assignment_17 {

	void printIndexOfString(String input) {
		for(int index=0;index<input.length();index++) {
			System.out.println(index + " -> " + input.charAt(index));
		}
	}

	public static void main(String[] args) {
		Assignment_17 assignment17 = new Assignment_17();
		assignment17.printIndexOfString("techno");
	}
}
