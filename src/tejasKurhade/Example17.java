package tejasKurhade;

public class Example17 {
	
	static String input = "Techno";
	
	void printAllChar(String input) {
		for(int index=0; index<input.length();index++) {
			System.out.println(index+" -> "+input.charAt(index));
		}
	}

	public static void main(String[] args) {
		Example17 example17 = new Example17();
		example17.printAllChar(input);
		System.out.println("made for exaple 17");
	}

}
