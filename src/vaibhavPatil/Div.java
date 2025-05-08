package vaibhavPatil;


class Div{
		
	void printNum(){
		for(int num=1; num<=100; num++){
			if(num%5==0 && num%7==0){
				System.out.println(num + " is Divided by 5 and 7");
			}else if(num%5==0){
				System.out.println(num+ " is divisible by 5");
			}else if(num%7==0){
				System.out.println(num+ " is Divisible by 7");
			}
		} 
	}
	
	public static void main(String[] args){
		Div div = new Div();
		div.printNum();
	}
}