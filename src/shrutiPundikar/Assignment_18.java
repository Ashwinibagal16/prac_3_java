package shrutiPundikar;

public class Assignment_18 {
		
		void printFrequency(String input) {
			int len = input.length();
			int count = 0;
			for(int index=0; index<len; index++) {
				char ch = input.charAt(index);
				if(ch=='e') {
					count++;
				}
			}
			System.out.println("Frequency of e-> " + count);
		}
		
		public static void main(String[] args) {
			Assignment_18 assignment18 = new Assignment_18();
			assignment18.printFrequency("technocredits");
		}
}
