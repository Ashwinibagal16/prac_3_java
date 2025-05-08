package yogeshGhuge;

public class Assignment_17 {
	
	void printChar(String str) {
		
		for(int index=0; index<str.length();index++) {
			//char ch = str.charAt(index);
			System.out.println(index + "->" + str.charAt(index));	
		}
	}
	
	public static void main(String[] args) {
		Assignment_17 assign_17 = new Assignment_17();
		assign_17.printChar("techno");

	}

}
