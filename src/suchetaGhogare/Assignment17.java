package suchetaGhogare;

public class Assignment17 {
	
	void printChar(String input) {
		System.out.println("Displaying all characters in string below :");
		for (int index=0; index<input.length(); index++) {
			System.out.println(index + " -> " + input.charAt(index));		
		}
	}

	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		assignment17.printChar("Technocredits");				
	}

}