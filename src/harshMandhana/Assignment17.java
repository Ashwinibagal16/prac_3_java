package harshMandhana;

public class Assignment17 {
	
	void printString(String str)
	{
		for(int num=0; num< str.length(); num++)
		{
			System.out.println(str.charAt(num));
		}
	}

	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		assignment17.printString("techno");
	}

}
