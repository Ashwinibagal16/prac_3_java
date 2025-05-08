package jayaSahu;

public class CharPrinter {
	
	void printChar(String input) {
		
		for(int i = 0; i < input.length(); i++) {
			System.out.println(i + "->" + input.charAt(i));
			
		}
		
	}
	
	public static void main (String[] args) {
		String input = "technocredits";
		CharPrinter charprint = new CharPrinter();
		charprint.printChar(input);
		
	}

}
