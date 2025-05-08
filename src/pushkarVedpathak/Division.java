package pushkarVedpathak;

class Division{
	
	void processData(int start, int end){
		System.out.println("Numbers divisible by 5 & 3 are :");
		for(int num=start; num<=end; num++){
			if(num%5 == 0 && num%3 == 0){
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args){
		Division division = new Division();
		division.processData(5,40);
	}
}