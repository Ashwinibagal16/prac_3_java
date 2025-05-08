package vidyaPatil;

class EvenNumberRange{
	void findEvenNumberGivenRange(int num1,int num2){
		System.out.println("Even Numbers in range "+ num1 + " to " + num2 + " are:");
		for(int count=num1;count<=num2;count++){
			if(count%2==0){
				System.out.println(count);
			}
		}
	}
	
	public static void main(String[] args){
		EvenNumberRange evenNumberRange = new EvenNumberRange();
		evenNumberRange.findEvenNumberGivenRange(10,15);
	}
}