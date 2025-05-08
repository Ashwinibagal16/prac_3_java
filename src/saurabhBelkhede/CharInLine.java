package saurabhBelkhede;

public class CharInLine {

	int count;
	
	void checkChar(String input) {
		
		for(int index=0; index< input.length(); index++) { // input.length() to check the string across its length
			char check=input.charAt(index); // variable to hold the character at current index
				if(check=='e') {            // Matching the character held in check variable
					count++;				// character match increments the count
				}
		}
		System.out.println("e appears " + count + " times");
	}
	
	public static void main(String[] args) {
		CharInLine charInLine = new CharInLine();
		charInLine.checkChar("Pre-defined");
	}
}
