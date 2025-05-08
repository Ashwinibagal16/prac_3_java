package pratikWaghmare;
class DivisibleNumbers{
	int start, end;
	void divison(int start, int end){
		
		System.out.println("Numbers divisible by 5 and 3 are between "+ start + " and "+ end + " are: ");
		
		for(int i = start; i <=end; i++){
			
			if(i % 5 == 0 && i % 3 == 0){
				System.out.println( i );
			}
			
		}
	}
	
	public static void main(String a[]){
		DivisibleNumbers divisibleNumbers = new DivisibleNumbers();
		divisibleNumbers.divison(5,40);
	}
}