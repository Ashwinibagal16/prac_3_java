package madhuriMalvi;

public class CharacterAtIndex {
	void printAllChar(String str) {
		for(int index =0; index< str.length(); index++) {
			System.out.println(index + " -> " + str.charAt(index));
		}
	}
	
	public static void main(String[] args) {
		CharacterAtIndex characterAtIndex = new CharacterAtIndex();
		characterAtIndex.printAllChar("techno");		
	}
}
