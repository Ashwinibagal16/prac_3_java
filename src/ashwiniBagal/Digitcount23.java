package ashwiniBagal;

public class Digitcount23 {
	
	public static void main(String[] args) {
		String input = "Te2chn6ocre4diTsKan2a3n4i";
		int count = getDigitalcount(input);
		 System.out.println("Output: " + count);
	}

	static int getDigitalcount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
			count++;
			}
		}
		return count;
	}

}
