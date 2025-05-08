package anushreePatra;

class NumberDivisible {
	int count=0;
	int max=0;
	int sum=0;
	
	void printDivisible(int startRange, int endRange){
		System.out.println("Numbers divisible by 7: ");	
	for(int num=startRange; num<=endRange; num++) {
		if(num%7==0) {	
			System.out.print(num + " ");	
			max=num;
			sum=sum+num;
			count++;					
		}
			
	}	
	}
	void printNumber() {
		 System.out.println();
		System.out.println("Maximum number divisible by 7: " + max);
		System.out.println("Sum of numbers divisible by 7: " + sum);	
		System.out.println("Average of numbers divisible by 7: " + (sum/count));	
	}

	public static void main(String[] args) {
		NumberDivisible numberdivisible = new NumberDivisible();
		numberdivisible.printDivisible(10,50);
		numberdivisible.printNumber();
		

	}

}
