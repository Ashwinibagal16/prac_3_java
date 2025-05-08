package krupa;

public class Assignment_17 {

	void printAllChar(String input) {
		int len=input.length();
		for(int index=0; index<len; index++) {
			char ch=input.charAt(index);
			System.out.println(index +" -> "+ch);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_17 printChar = new Assignment_17();
		printChar.printAllChar("techno");

	}

}
