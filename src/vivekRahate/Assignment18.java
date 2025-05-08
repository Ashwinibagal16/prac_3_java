package vivekRahate;

public class Assignment18 {
	static int count = 0;

	void printFrequncyChar(String input,char c) {

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'c') {
				count++;
			}
		}

	}

	public static void main(String[] args) {
		Assignment18 assignmen18 = new Assignment18();
		assignmen18.printFrequncyChar("technocredits",'e');
		System.out.println("e --> " + count);

	}

}
