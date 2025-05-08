package rohanNaik;

public class Assignment18 {
	
	int count;
	
	void processName(String name) {
		for(int index = 0; index<name.length(); index++) {
			if(name.charAt(index) == 'e') {
				count++;
			}
		}
		
		System.out.println("e -> " + count);
	}

	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();
		assignment18.processName("technocredits");
	}

}
