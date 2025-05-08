package nitinSharma;

public class PrintChar {
	
	void printIndex(String input) {
		for(int index = 0; index < input.length(); index++) {
			System.out.println(index +"--->"+ input.charAt(index));
		}
	}
	public static void main(String[] args) {
		PrintChar printChar = new PrintChar();
		printChar.printIndex("techno");
	}

}
