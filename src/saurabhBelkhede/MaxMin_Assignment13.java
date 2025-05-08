package saurabhBelkhede;
//Asignment 13
class MaxMin{
	
	void findmin(int num1, int num2){ // shouldn't be space btween NUM & 1 AND comma (,) as separator
		if (num1 == num2){
			System.out.println(num1 + " & " + num2  + " are same");
		}else if(num1 < num2){
			System.out.println(num1 + " is samller between " + num1 + " & " + num2);
		}else{
			System.out.println(num2 + " is samller between " + num1 + " & " + num2);
		}
		
	}
			
	void findmax(int num3, int num4){		
		if (num3 == num4){
			System.out.println(num3 + " & " + num4  + " are same");
		}else if (num4 > num3){
			System.out.println(num4 + " is bigger between " + num3 + " & " + num4);
		}else{
			System.out.println(num3 + " is bigger between " + num3 + " & " + num4);
		}
		
	}
		
	public static void main(String[] args){
		MaxMin maxmin = new MaxMin();
		maxmin.findmin(10, 20);
		maxmin.findmin(20, 20);
		maxmin.findmax(20, 50);
	}
}
		
		