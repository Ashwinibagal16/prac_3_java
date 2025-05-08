package aniketBalsaraf;

public class Assignment18 {

	void printFreChar(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'e') {
				count++;
			}
		}
		System.out.println("e" + "->" + count);
	}

	public static void main(String[] args) {
		String str = "technocredits";
		Assignment18 assignment18 = new Assignment18();
		assignment18.printFreChar(str);
	}

}
