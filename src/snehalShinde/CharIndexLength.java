package snehalShinde;

class CharIndexLength{
	
	void printAllChar(String input){
		int len = input.length();
		System.out.println("The given input is : " + input + "\n" + "And it's length is : " + len);
		System.out.println("Index-wise characters in the given input are as below - ");	
		for(int index = 0 ; index < input.length() ; index++){
			System.out.println(index + " --> " + input.charAt(index));
		}
	}
	
	public static void main(String[] args){
		CharIndexLength charIndexLength = new CharIndexLength();
		charIndexLength.printAllChar("SnehalShinde");
	}
}