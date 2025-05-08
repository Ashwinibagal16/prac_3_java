package shrutiPundikar;

class MinMax{
	
	void minNumber(int num1, int num2){
		System.out.println("num1: " +num1);
		System.out.println("num1: " +num2);
		if(num1 < num2){
			System.out.println(num1+" is smaller between " + num1 + " and " + num2);
		}else{
			System.out.println(num2+" is smaller between " + num1 + " and " + num2);
		}
	}
	
	void maxNumber(int num1, int num2){
		System.out.println("num1: " +num1);
		System.out.println("num1: " +num2);
		if(num1 > num2){
			System.out.println(num1+" is bigger between " + num1 + " and " + num2);
		}else{
			System.out.println(num2+" is bigger between " + num1 + " and " + num2);
		}
	}
	
	public static void main(String[] args){
		MinMax minmax = new MinMax();
		minmax.minNumber(10,17);
		System.out.println();
		minmax.minNumber(7,6);
		System.out.println();
		minmax.maxNumber(10,17);
		System.out.println();
		minmax.maxNumber(7,6);
		
	}
}