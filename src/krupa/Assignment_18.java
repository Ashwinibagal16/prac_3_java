package krupa;

public class Assignment_18 {

	void printFrequencyChar(String input) {
		int count=0;
		int len= input.length();
		for(int index=0; index<len; index++) {
			char ch = input.charAt(index);
			if(ch=='e') {
				count++;
			}
		}
		System.out.println("e --> "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_18 freqChar = new Assignment_18();
		freqChar.printFrequencyChar("technocredits");
	}

}
