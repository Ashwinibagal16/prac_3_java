//A-16
package nishmita;
class MathsOperation {
	int max, sum, avg, count;
	void mathsOperator(int startRange, int endRange)
	{
		for(int num=startRange; num<= endRange; num++)
		{
			if(num%7 == 0)
			{
				System.out.println(num+" is divisible by 7");
				max = num;
				count++;
				sum=sum+num;
			}
		}
		avg = sum/count;
		System.out.println("Maximum number divisible by 7 is:"+ max);
		System.out.println("Sum of all numbers divisible by 7 is:"+ sum);
		System.out.println("Average of all numbers divisible by 7 is:"+avg);
	}

	public static void main(String[] args) {
		MathsOperation mathsOperation = new MathsOperation();
		mathsOperation.mathsOperator(10, 50);
	}

}