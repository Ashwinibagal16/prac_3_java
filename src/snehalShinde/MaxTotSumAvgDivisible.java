package snehalShinde;

class MaxTotSumAvgDivisible{
	
	void divisibleAllStats(int startIndex, int endIndex){
		int max = 0;
		int count = 0;
		int sum = 0;
		System.out.println("Numbers which are divisible by 7 within range " + startIndex + " and " + endIndex + " are : ");
		for(int num = startIndex ; num <= endIndex ; num++){
			if (num % 7 == 0){
				if (num > max){
				max = num;
				}
				count++;
				sum = sum + num;
				System.out.println(num);
			}
		}
		if(count > 0){
			System.out.println("Maximum number divisible by 7 within a given range is : " + max);
			System.out.println("Total numbers divisible by 7 within a given range are : " + count);
			System.out.println("The sum of all numbers divisible by 7 within the given range is : " + sum);
			System.out.println("Average of all numbers divisible by 7 within the given range is : " + ((float) sum/count));
		}else{
			System.out.println("No numbers divisible by 7 found in the given range.");
		}
	}
	
	public static void main (String[] args){
		MaxTotSumAvgDivisible maxTotSumAvgDivisible = new MaxTotSumAvgDivisible();
		maxTotSumAvgDivisible.divisibleAllStats(10,50);
	}	
}