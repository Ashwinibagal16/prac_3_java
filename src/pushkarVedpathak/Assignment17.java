package pushkarVedpathak;

public class Assignment17 {

	void processData(String name) {
		for (int s = 0; s < name.length(); s++) {
			int count = s;
			System.out.println(count + " -> " + name.charAt(s));
		}
	}

	public static void main(String[] args) {
		Assignment17 assign17 = new Assignment17();
		assign17.processData("PushkarVedpathak");
	}
}
