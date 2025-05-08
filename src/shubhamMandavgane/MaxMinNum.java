package shubhamMandavgane;
class MaxMinNum{

	void min(int num1, int num2){
		if(num1<num2){
			System.out.println(num1+ " is smaller between " + num1 + " and " + num2 + ".");
		}
		else{
			System.out.println(num2+ " is smaller between " + num1 + " and " + num2 + ".");
		}
	}
	
	void max(int num3, int num4){
		if(num3>num4){
			System.out.println(num3+ " is bigger between " + num3 + " and " + num4 + ".");
		}
		else{
			System.out.println(num4+ " is bigger between " + num3 + " and " + num4 + ".");
		}
	}
	
	public static void main(String[] args){
		MaxMinNum maxminnum= new MaxMinNum();
		maxminnum.min(10,17);
		maxminnum.max(10,17);
	}
}