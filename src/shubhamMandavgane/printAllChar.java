package shubhamMandavgane;

public class printAllChar {
	
	void printAllchar(String input) {
		int len = input.length();
		for(int index = 0; index <input.length(); index++) {
			System.out.println(index+ " --> " +input.charAt(index));
		}
	}

	public static void main(String[] args) {
		printAllChar printallchar= new printAllChar();
		printallchar.printAllchar("technoc");

	}

}
