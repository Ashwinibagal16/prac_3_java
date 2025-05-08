package jeetHingrajiya;

public class Assignment16{
	void processData(int startRange,int endRange){
		int count=0;
		float sum=0;
		int max=0;
		float avg=0;

		System.out.print("Numbers divisible by 7 are :");
		for(int num=startRange; num<=endRange; num++){
			if(num%7==0){
				count++;
				max=num;
				sum=sum+num;
				avg=sum/count;
				System.out.print(num+" ");
			}
		}
		System.out.println();
		System.out.println("Max number among all divisible by 7 is : "+max);
		System.out.println("Sum of all Numbers is : "+sum);
		System.out.println("Average is "+avg);
	}

	public static void main(String[]args) {
		Assignment16 assignment16=new Assignment16();
		assignment16.processData(10,50);
	}
}
