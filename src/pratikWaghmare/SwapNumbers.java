package pratikWaghmare;
class SwapNumbers{
	int m = 9;
	int n = 5;
	int temp;
	
	void swap(){
		temp = m;
		m = n;
		n = temp;
	}
	
	void displayInitial(){
		System.out.println("Initial values of integer m and n are " + m + " and " + n);
	}
	
	void displaySwapped(){
		System.out.println("Swapped values of integer m and n are " + m + " and " + n);
	}
	
	public static void main(String[] args){
		SwapNumbers swapNumber = new SwapNumbers();
		swapNumber.displayInitial();
		swapNumber.swap();
		swapNumber.displaySwapped();
	}
}