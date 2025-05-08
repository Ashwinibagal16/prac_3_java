package chandniFatehchandani;

/* Assignment 17 : From given string print all characters
String input = techno;
output :
t
e
c
h
n
o */

class Assignment17{

	void printAllChar(String input){
		for(int index= 0; index < input.length();index++){
			System.out.println(input.charAt(index));
		}
	}
	public static void main(String[] args){
		Assignment17 assignment17 = new Assignment17();
		String str = "techno";
		assignment17.printAllChar(str);
	}	
}