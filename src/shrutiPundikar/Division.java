package shrutiPundikar;

class Division{
	
	void divNum(int start, int end){
		System.out.println("Number divisible by 5 & 3 are");
		
		for(int num=start; num<=end; num++){
			if(num%3 == 0 && num%5 == 0){
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args){
		Division division = new Division();
		division.divNum(5,40);
	}
}