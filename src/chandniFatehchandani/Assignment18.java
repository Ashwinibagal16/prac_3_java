package chandniFatehchandani;

/* Assignment 18 : From given string print frequency of char e
String input = technocredits;
output : e > 2 */

class Assignment18{

	int count = 0;
	void CountofGivenChar(String input){
		for(int index = 0; index < input.length();index++){
			char ch = input.charAt(index);
			if (ch == 'e'){
				count++;
			}
		}
	}
	
	public static void main(String[] args){
		Assignment18 assignment18 = new Assignment18();
		assignment18.CountofGivenChar("technocredits");
		System.out.println("Frequency of e in the given String is  : " + assignment18.count);
	}
}