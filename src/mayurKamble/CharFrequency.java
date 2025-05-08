package mayurKamble;

class CharFrequency{
	
	void displayCharFreq(String input){
		int count=0;
		for(int index=0;index<input.length();index++){
			if(input.charAt(index)=='e'){
				count++;
			}
		}
		System.out.println("The Frequency of character 'e' in given String is :"+count);
	}
	
	public static void main(String[]args){
		CharFrequency charFrequency=new CharFrequency();
		charFrequency.displayCharFreq("Technocredits");
	}
}