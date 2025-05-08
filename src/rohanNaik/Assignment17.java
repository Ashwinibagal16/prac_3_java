package rohanNaik;

public class Assignment17 {

	void processName(String name) {
		
		for(int index=0; index<name.length(); index++) {
			System.out.println(index +" -> "+ name.charAt(index));
		}
	}
		
	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		assignment17.processName("Techno");
	}

}
