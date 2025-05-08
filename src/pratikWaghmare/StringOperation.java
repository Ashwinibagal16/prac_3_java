package pratikWaghmare;

public class StringOperation {
	String S;
	void printChars(String S) {
		for(int i = 0; i < S.length(); i++) {
			System.out.println(i + " -> "+ S.charAt(i));
		}
	}
	public static void main(String a[]) {
		StringOperation stringOp = new StringOperation();
		stringOp.printChars("techno");
	}
}
