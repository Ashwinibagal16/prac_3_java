package snehalShinde;

class CharIndexFrequency{
	
	void printCharFreq(String input){
		int len = input.length();
		int count = 0;
		System.out.println("The given input is : " + input + "\n" + "And it's length is : " + len);
		
		for(int index = 0 ; index < input.length() ; index++){
			char ch = input.charAt(index);
			if(ch == 'h'){
				count++;
			}
		}
		System.out.println("Frequency of charachter 'h' in the given input is : " + count);
		
	}
			
	public static void main(String[] args){
		CharIndexFrequency charIndexFrequency = new CharIndexFrequency();
		charIndexFrequency.printCharFreq("SnehalShinde");
	}
}