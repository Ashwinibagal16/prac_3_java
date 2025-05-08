package pushkarVedpathak;

class MaxMin{
	
	void minNumber(int n1, int n2){
		if(n1<n2){
			System.out.println(n1 + " is smaller between " + n1 + " and " + n2);
		}else{
			System.out.println(n2 + " is smaller between " + n2 + " and " + n2);
		}
	}
	
	void maxNumber(int n1, int n2){
		if(n1>n2){
			System.out.println(n1 + " is bigger between " + n1 + " and " + n2);
		}else{
			System.out.println(n2 + " is bigger between " + n2 + " and " + n1);
		}
	}
	
	public static void main(String[] args){
	MaxMin output = new MaxMin();
	output.minNumber(10,17);
	output.maxNumber(10,17);
	}
}