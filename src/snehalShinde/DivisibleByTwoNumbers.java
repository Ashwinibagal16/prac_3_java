package snehalShinde;

class DivisibleByTwoNumbers{
	
	void diviByMultiNums(int startIndex, int endIndex){
		System.out.println("Numbers which are divisible by 5 and 3 from the range " + startIndex + " to " + endIndex + " are : ");
		for(int num = startIndex ; num <= endIndex ; num++){
			if (num%5==0 && num%3==0){
				System.out.println(num);
			}
		}
	}
	
	public static void main (String[] args){
		DivisibleByTwoNumbers divisibleByTwoNumbers = new DivisibleByTwoNumbers();
		divisibleByTwoNumbers.diviByMultiNums(5,40);
	}
}



