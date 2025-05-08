/*For given String, print all the characters in new line.

String input = "techno";
output :
0 → t
1 → e
2 → c
3 → h
4 → n
5 → o
6 → c
*/
package priyankaZende;
class PrintAllCharsOnNewLine17{
	void printAllCharsOnNewLine(String input){
		int len= input.length();
		for(int index =0; index < len; index++){
			System.out.println(index +"->"+input.charAt(index));
		}
	}
	
	public static void main(String[] args){
		PrintAllCharsOnNewLine17 printAllCharsOnNewLine17 = new PrintAllCharsOnNewLine17();
		printAllCharsOnNewLine17.printAllCharsOnNewLine("techno");
	}
}	

