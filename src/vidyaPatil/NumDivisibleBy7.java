package vidyaPatil;

public class NumDivisibleBy7 {

	void numDivisibleBy7(int startIndex, int endIndex) {
		
		int count=0;
		int max=0;
		int sum=0;
		int avg=0;
		
		System.out.print("Numbers divisible by 7 are : ");
		
		for (int num= startIndex; num<= endIndex; num++){
			if(num%7==0){
				System.out.print(num + " ");
				count++;
				max=num;
				sum=sum+num;
			}	
		}
		avg = (sum/count);
		System.out.println();
		System.out.println("Count of Numbers divisible by 7 in given range: " + count);
		System.out.println("Maximum Number divisible by 7: " + max);
		System.out.println("Sum of Numbers divisible by 7: " + sum );
		System.out.println("Average of Numbers divisible by 7: " + avg);		
	}
	
	public static void main(String[] args) {
		
		NumDivisibleBy7 numDivisibleBy7 = new NumDivisibleBy7();		
		numDivisibleBy7.numDivisibleBy7(10, 50);
		
		
	}
	
	
}
