package suchetaGhogare;

public class Assignment18{

	void displayChar(String input) {
		int count=0;
		for (int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if (ch=='e'){
				count++;
			}	
		}
		System.out.println("e"+ " -> "+count);
	}
	
	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();
		assignment18.displayChar("technocredits");
	}
}
