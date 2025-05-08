package tejasKurhade;

class Problem1{
	
	void checkNum(int num){
		if (num%7 == 0 && num%5 == 0){
			System.out.println(num +" number is divisible by 5 and 7");
		}
		else if (num%7 == 0){
			System.out.println(num +" is divisible by 7");
		}
		else if (num%5 == 0){
			System.out.println(num +" number is divisible by 5");
		}
	}
	

	
	public static void main(String[] args){
		Problem1 problem1 = new Problem1();
		problem1.checkNum(35);
	}
		
	
}