package vidyaPatil;
class DivisibleBy{
	void findDivBy(int num1,int num2){
		System.out.println("In the given range "+ num1 + " to "+ num2 + " divisible by 5 & 3, numbers are:");
		for(int count=num1;count<=num2;count++){
			if(count%5==0 && count%3==0){
				System.out.println(count);
			}
		}
	}
	
	void findDivBy1(int num1,int num2, int n1, int n2){
		System.out.println("In the given range "+ num1 + " to "+ num2 + " divisible by "+ n1 +" & "+ n2 +",numbers are:");
		for(int count=num1;count<=num2;count++){
			if(count%n1==0 && count%n2==0){
				System.out.println(count);
			}
		}
	}
	
	public static void main(String[] args){
		DivisibleBy divisibleBy = new DivisibleBy();
		divisibleBy.findDivBy(5,40);
		divisibleBy.findDivBy1(5,40,5,3);
		divisibleBy.findDivBy1(15,40,2,3);
	}
	
}