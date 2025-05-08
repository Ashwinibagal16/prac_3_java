package pratikWaghmare;
class NumberCompare{
	int m, n;
	
	void findMax(int m, int n){
		if( m < n){
			System.out.println(m + " is smaller  between " + m + " and " + n);
		}
		else{
			System.out.println(n + " is smaller  between " + m + " and " + n);
		}
	}
	
	void findMin(int m, int n){
		if( m > n){
			System.out.println(m + " is greater  between " + m + " and " + n);
		}
		else{
			System.out.println(n + " is greater  between " + m + " and " + n);
		}
	}
	
	public static void main(String a[]){
		NumberCompare numberCompare = new NumberCompare();
		numberCompare.findMax(10,17);
		numberCompare.findMin(10,17);
	}


}