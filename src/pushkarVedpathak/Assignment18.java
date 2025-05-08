package pushkarVedpathak;

public class Assignment18 {

	int count;
	int value;

	void processData(String name) {
		for (int s = 0; s < name.length(); s++) {
			char value = name.charAt(s);
			if (value == 'e') {
				count++;
			}
		}
		System.out.println("e -> " + count);
	}

	public static void main(String[] args) {
		Assignment18 assign18 = new Assignment18();
		assign18.processData("technocredits");
	}
}
