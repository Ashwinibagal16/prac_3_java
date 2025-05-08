package pratikWaghmare;

public class StringOperationA18 {
	String s;
	int count;
	char a;
	
	void printFreq(String s, char a) {
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == a) {
				count++;
			}
		}
		System.out.println("Frequence of " + a + " in "+ s + " is " + count); 
	}
	
	public static void main(String[] args) {
		StringOperationA18 stringOp = new StringOperationA18();
		stringOp.printFreq("technocredits", 'e');
	}
}
