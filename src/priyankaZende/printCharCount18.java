/*On user defined String, print frequency of char e.

String input = "technocredits";
output : e → 2
*/

package priyankaZende;
class PrintCharCount18{
	
	void printCharCount(String input){
		int count=0;
		for(int index =0; index < input.length(); index++){
			if(input.charAt(index) == 'e')
				count++;
		}
		System.out.println("Char 'e' count is ->" + count);
	}

	public static void main(String[] args){
		PrintCharCount18 printCharCount18 = new PrintCharCount18();
		printCharCount18.printCharCount("technocredits");
	}
}	
