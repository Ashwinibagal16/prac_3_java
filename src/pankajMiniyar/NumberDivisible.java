//Assignment-16
package pankajMiniyar;

public class NumberDivisible {
	void displayNmbers(int start, int end) {
		int max=0;
		float sum=0;
		int count=0;
		float avg=0;
		System.out.print("Numbers divisible by 7: ");
		for(int num=start;num<=end;num++) {
			if(num%7==0) {
				max=num;
				sum=sum+num;
				count++;
				System.out.print(num+ " ");
			}
		}
		System.out.println();
		System.out.println("Maximum number divisible by 7: "+max);
		System.out.println("Sum of all numbers divisible by 7: "+sum);
		avg=sum/count;
		System.out.println("Average of numbers divisible by 7: "+avg);
	}
	
	public static void main(String[] args) {
		NumberDivisible numberDivisible=new NumberDivisible();
		numberDivisible.displayNmbers(10, 50);
	}

}
