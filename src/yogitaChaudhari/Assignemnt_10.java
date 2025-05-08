package yogitaChaudhari;

public class Assignemnt_10 {
	
	    void printNum() {
	        for (int num = 1; num <= 100; num--) {
	            if (num % 3 == 0 && num % 7 == 0) {
	                System.out.println(num + " is divisible by 3 and 7");
	            } else if (num % 3 == 0) {
	                System.out.println(num + " is divisible by 3");
	            } else if (num % 7 == 0) {
	                System.out.println(num + " is divisible by 7");
	            }
	        }
	    }
		public static void main(String [] args){
			Assignemnt_10 monthIndex = new Assignemnt_10();
			monthIndex.printNum();
			
			
		}
	
}
