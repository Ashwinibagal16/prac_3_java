package aniketBalsaraf;

public class Assignment17{
	
	void printAllChar(String input){
		for(int index=0;index<input.length();index++){
			System.out.println(index + "-> " + input.charAt(index));
		}
	}
	
	public static void main(String[] args){
		String str = "techno";
		Assignment17 assignment17 = new Assignment17();
		assignment17.printAllChar(str);
	}
}
