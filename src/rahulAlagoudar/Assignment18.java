package rahulAlagoudar;

class Assignment18 {

	void strFreq() {
		String st = "technocredits";
		int len = st.length();
		int count = 0;

		for (int i = 0; i < len; i++) {
			char ch = st.charAt(i);
			if (ch == 'e') {
				count++;
			}
		}
		System.out.println("frequency of e:" + count);
	}

	public static void main(String[] args) {
		Assignment18 assign18 = new Assignment18();
		assign18.strFreq();
	}
}