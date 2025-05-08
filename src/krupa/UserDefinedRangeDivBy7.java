package krupa;

class UserDefinedRangeDivBy7 {

  void printNumDivBy7(int startRange, int endRange) {
	  int count=0;
	  int sum=0;
	  int max=0;
	  int avg=0;
	  for(int num=startRange; num<=endRange; num++) {
		 if(num%7==0) {
            System.out.println(num + " is div by 7");
			max=num;
			count=count+1;
			sum=sum+num;
			avg=sum/count;
		 }			 
	  } 
	  System.out.println(max + " is maximum number divisible by 7");
	  System.out.println(sum + " is sum of all numbers divisible by 7");
	  System.out.println(count + " is total count divisible by 7");
	  System.out.println(avg + " is average number of divisible by 7");
	  
  }
  
  public static void main(String[] args) {
	 UserDefinedRangeDivBy7 numDivBy7 = new UserDefinedRangeDivBy7();
     numDivBy7.printNumDivBy7(10,50);	 
  }

}