package rahulAlagoudar;

class Assignment17 {

	String st = "Techocredits";

	void print() {
		int len = st.length();
		for (int i = 0; i < len; i++) {
			System.out.println(i + " -> " + st.charAt(i));
		}
	}

	public static void main(String[] args) {
		Assignment17 Assign17 = new Assignment17();
		Assign17.print();
	}
}