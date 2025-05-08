package harshMandhana;

public class Assignment18 {
	
	int count;
	
	void stringFrequency(String str)
	{
		for(int num=0; num<str.length();num++)
		{
			if(str.charAt(num)=='e')
			{
				count++;
			}
		}
		System.out.println("String Input: "+str);
		System.out.println("e is repeating for:"+count+" times");
	}

	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();
		assignment18.stringFrequency("technocredits");
	}

}
