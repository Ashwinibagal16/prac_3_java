package mayurKamble;

class Ae17_StringCharPrint{
	
	void PrintAllChar(String input){
		for(int index=0;index<input.length();index++){
			System.out.println(index+" -> "+input.charAt(index));
		}
	}
	
	public static void main(String[] args){
		Ae17_StringCharPrint ae17_StringCharPrint = new Ae17_StringCharPrint();
		ae17_StringCharPrint.PrintAllChar("Techno");
	}
}