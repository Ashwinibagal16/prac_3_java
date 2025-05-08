package shubhamMandavgane;

public class NumDivBy7 {
	int max=0;
	int sum=0;
	int count=0;
	void printlargestDivNum(int startRange, int endRange) {
		for(int num=startRange; num<=endRange; num++){
			if(num%7==0){
				max=num;
				sum= sum+num;
				count= count +1;
				System.out.println("Numbers divisible by 7: " +num);
				
			}
		}
		System.out.println("Maximum number divisible by 7: " +max);
		System.out.println("Sum of numbers divisible by 7:: " +sum);
		System.out.println("Average of numbers divisible by 7: " +(sum/count));
	}

	public static void main(String[] args) {
		NumDivBy7 numdivby7 = new NumDivBy7();
		numdivby7.printlargestDivNum(10, 50);
	}

}
