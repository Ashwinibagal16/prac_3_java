package nitinSharma;
//Assignment: Working with Numbers Divisible by 7

public class NumberRange {
	
	

	void processNumbers(int start, int end) {
		int max = 0;
		int count =0;
		float sum = 0;
		float average =0;
		
		for(int num = start; num <= end; num++) {
			if (num%7 == 0) {
			System.out.println(num + " number is divisible by 7");
			max = num;
			count++;
			sum = sum+num;
			average = sum/count;
			}
		}
			System.out.println(max + " is the largest number divisible by 7");
			System.out.println(sum +" is the sum of all the number divisible by 7");
			System.out.println(average+ " is the average of all the numbers with in the range");
			
		
		}

}
