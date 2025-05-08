package mayurKamble;

class MaxMinValue{
	
	void maxNumber(int num1,int num2){
		if(num1>num2){
			System.out.println(num1+" is larger between "+num1+" and "+num2);
		}else
			System.out.println(num2+" is larger between "+num1+" and "+num2);
	} 
	
	void minNumber(int num1,int num2){
		if(num1<num2){
			System.out.println(num1+" is smaller between "+num1+" and "+num2);
		}else
			System.out.println(num2+" is smaller between "+num1+" and "+num2);
	} 
	
	public static void main(String[]args){
		MaxMinValue maxMinValue= new MaxMinValue();
		maxMinValue.maxNumber(10,17);
		maxMinValue.minNumber(17,10);
	}
}