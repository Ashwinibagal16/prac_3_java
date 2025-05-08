package omkarBhujbal;

public class Assignment16 {
	void TotMaxSumAvgDiv(int start , int end ){
		 int max = Integer.MIN_VALUE;
	     int count = 0;
	     int sum = 0;
	     System.out.println("Number is divisible by 7 are "+ start + " & "+end + " is->");
	     for (int num=start; num<=end; num++) {
	    	 if(num % 7==0) {
	    		if(num>max) {
	    			max=num;
	    		}
	    		count++;
	    		sum = sum+num;
	    		System.out.println(num);
	    	 }
	     }
	     if(count >0) {
	    	 System.out.println("Maximum number divisible by 7 within a given range is : " + max);
	            System.out.println("Total numbers divisible by 7 within a given range are : " + count);
	            System.out.println("The sum of  numbers divisible by 7 in given range is : " + sum);
	            System.out.println("Average of  numbers divisible by 7 in given range is : " + (sum / count));
	     }else {
	    	 System.out.println("Number is not divisible by 7");
	     }
	}
	public static void main(String[] args) {
		Assignment16 assign16= new Assignment16();
		assign16.TotMaxSumAvgDiv(10,50);
	}
}
