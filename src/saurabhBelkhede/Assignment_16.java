package saurabhBelkhede;
//Assignment 16
class Assignment_16{
	
	int max;
	int count;
	int avg;
	int sum;
	
	void printEven(int startIndex, int endIndex){
		for(int i= startIndex ; i <= endIndex; i++){
			if(i % 7 ==0 ){
				System.out.println("Divisible numbers by 7 is: " + i);
				max=i;
				count++;
				sum=sum+i;
				avg=sum/count;
			}
		}
		
		System.out.println("Max Divisible numbers by 7 is: " + max);
		System.out.println("Total Divisible numbers by 7 are: " + count);
		System.out.println("Total Divisible numbers by 7 is: " + count);
		System.out.println("Sum of numbers  by 7 is: " + sum);
		System.out.println("Avg of numbers  by 7 is: " + avg);
	}
	
	
	public static void main(String[] args){
		Assignment_16 evenno = new Assignment_16();
		evenno.printEven(20,100);
	}
}