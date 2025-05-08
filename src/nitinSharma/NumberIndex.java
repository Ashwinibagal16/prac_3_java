package nitinSharma;
//print all numbers which are divisible by 5 and divisible by 3.
public class NumberIndex {
	
	void numberDiv(int start, int end) {
		for(int num = start; num<=end ; num++) {
			if(num%3 == 0 && num%5 == 0) {
				System.out.println("Number divisible by both 5 and 3 are: "+ num);
			}
		}
	}
	
	public static void main(String[] args) {
		NumberIndex numberInd = new NumberIndex();
		numberInd.numberDiv(5, 40);
	}

}
