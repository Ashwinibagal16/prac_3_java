package anushreePatra;

class Divisible{
	void numberIndex(){
		for(int count=5; count<=40; count++){
			if(count%5==0 && count%3==0){
			System.out.println(count);
			}
		}
	}
	
	public static void main(String[] args){
		Divisible divisible = new Divisible();
		System.out.println("Divisible by 5 & 3, numbers are: ");
		divisible.numberIndex();
	}
}