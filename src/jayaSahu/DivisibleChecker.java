package jayaSahu;

class DivisibleChecker{
	
	void division(int start, int end){
		System.out.println("Divisible by 5 & 3, numbers are:");
		for(int i = start; i<= end; i++){
			if (i % 5 == 0 && i % 3 == 0){
				System.out.println(i);
			}
		}	
	}
	
	public static void main(String[] args){
		DivisibleChecker div = new DivisibleChecker();
		div.division(5,3);
		
	}
  }