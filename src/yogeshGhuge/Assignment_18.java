package yogeshGhuge;

public class Assignment_18 {

	int count;

	void printFreq(String str) {

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt((index));
			if (ch == 'e') {

				count++;

			}
		}
		System.out.println("Ferquncy of char " + "e is : " + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_18 assign_18 = new Assignment_18();
		assign_18.printFreq("Technocredits");

	}

}
