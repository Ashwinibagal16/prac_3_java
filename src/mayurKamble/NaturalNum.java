package mayurKamble;

class NaturalNum{
	void printNatNum(int num){
		for(int i=1;i<=num;i++){
			System.out.println(i);
		}
	}
	
	public static void main(String[]args){
		NaturalNum naturalNum= new NaturalNum();
		naturalNum.printNatNum(10);
	}
}