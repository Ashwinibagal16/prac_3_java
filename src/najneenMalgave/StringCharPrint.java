package najneenMalgave;

class StringCharPrint{

	void printAllChars(String input){
		int len = input.length();
		System.out.println("Input : " + input + "\n" + "String length : " + len);
		System.out.println("Index-wise chars in the given input are as below - ");	
		for(int index = 0; index < input.length() ; index++){
			System.out.println(index + " --> " + input.charAt(index));
		}
	}

	public static void main(String[] args){
		StringCharPrint StringCharPrint = new StringCharPrint();
		StringCharPrint.printAllChars("technocredits");
	}
}