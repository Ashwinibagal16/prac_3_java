package madhuriMalvi;

public class CharFrequency {
	void printCharFreq(String str) {
		int count = 0;
		for(int index = 0;index<str.length();index++) {
			if(str.charAt(index)=='e') {
				count++;
			}
		}
		System.out.println("Frequency of char e is " + count);
	}
	public static void main(String[] args) {
		CharFrequency charFrequency = new CharFrequency();
		charFrequency.printCharFreq("technocredits");
	}

}
