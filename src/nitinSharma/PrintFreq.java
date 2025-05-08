package nitinSharma;

public class PrintFreq {
	
	void printCharFreq(String input) {
		int count =0;
		for(int index = 0; index < input.length(); index++) {
			if(input.charAt(index)== 'e') {
				count++;
				System.out.println('e'+ "--->"+ count);
			}
		}
	}
	public static void main(String[] args) {
		PrintFreq printFreq = new PrintFreq();
		printFreq.printCharFreq("technocredits");
		
	}

}
