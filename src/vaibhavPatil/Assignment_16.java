package vaibhavPatil;

public class Assignment_16 {

	void divisible(int startIndex, int endIndex) {
		int max =0;
		int sum=0;
		int count =0;
		
		System.out.print("Numbers divisible by 7: ");
		for(int index=startIndex; index<=endIndex; index++) {
			if(index%7==0) {
				System.out.print(index+" ,");

				count++;

				max=index;

				sum=sum+index;

			}	
		}
		
		if (count>0) {
			double average = (double) sum / count;
            System.out.println("\nMaximum number divisible by 7: " + max);
            System.out.println("Sum of numbers divisible by 7: " + sum);
            System.out.println("Average of numbers divisible by 7: " + average);
		}
	}
	
	public static void main(String[] args) {		
		Assignment_16 assignment_16 = new Assignment_16();
		assignment_16.divisible(10,50);
		
	}

}
