package mayurKamble;

class DivisibleCheck{

	void displayNumber(int startIndex,int endIndex){
		if(startIndex<endIndex){
			System.out.println("Number's Divisible by 5 and 3 are :");
			for(int num=startIndex;num<=endIndex;num++){
				if(num%3==0 && num%5==0){
					System.out.println(num);
				}
			}
		}else{
			
			int temp=endIndex;
			endIndex=startIndex;
			startIndex=temp;
			
			System.out.println("Number's Divisible by 5 and 3 are :");
			for(int num=startIndex;num<=endIndex;num++){
				if(num%3==0 && num%5==0){
					System.out.println(num);
				}
			}
		}
	}
	
	public static void main (String[]args){
		DivisibleCheck divisileCheck = new DivisibleCheck();
		divisileCheck.displayNumber(5,40);
	}
}