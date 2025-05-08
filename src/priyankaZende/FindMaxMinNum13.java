/*Write 2 methods, one method to find maximum number from 2 numbers,
other to find minimum number from given 2 numbers.
sample input :
num1 : 10
num2 : 17
output : 10 is smaller between 10 and 17.
sample input :
num1 : 10
num2 : 17
output : 17 is bigger between 10 and 17.*/
package priyankaZende;
class FindMaxMinNum13{
	
	void findMaxNum(int num1, int num2){
		System.out.println("output : ");
		System.out.println("num1 : "+ num1);
		System.out.println("num2 : "+ num2);
		
		if(num1 > num2){
			System.out.println("output : " + num1 + " is bigger between "+num1+" and "+num2+".");
		} else {
			System.out.println("output : " + num2 + " is bigger between "+num1+" and "+num2+".");
		}	
	}	
		
	void findMinNum(int num1, int num2){
		System.out.println("output : ");
		System.out.println("num1 : "+ num1);
		System.out.println("num2 : "+ num2);
		
		if(num1 > num2){
			System.out.println("output : " + num2 + " is smaller between "+num1+" and "+num2+".");
		} else {
			System.out.println("output : " + num1 + " is smaller between "+num1+" and "+num2+".");
		}	
	}	

	public static void main(String[] args){
		FindMaxMinNum13 findMaxMinNum13 = new FindMaxMinNum13();
		findMaxMinNum13.findMaxNum(10, 17);
		findMaxMinNum13.findMinNum(10, 17);
	}
}	
		
		
