package ashwiniBagal;

public class CharFrequency {
	public static void main(String[] args) {
		String input = "technocredits";
		char target ='e';
		int count =0;
		
		for(int i = 0; i<input.length();i++) {
			if (input.charAt(i) == target) {
				 count++;
			}
		 }
		  System.out.println(target +"->" +count);
		}
	}


