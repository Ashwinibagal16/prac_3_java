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
package rohanNaik;

class Assignment13{

	void findMaxNum(int num1, int num2){
		System.out.println("Number 1 is: " + num1);
		System.out.println("Number 2 is: " + num2);
		if(num1>num2)
			System.out.println(num1+ " is bigger than" + num2);
		else
			System.out.println(num2+ " is bigger than" + num1);
	}
	
	void findMinNum(int num1, int num2){
		System.out.println("Number 1 is: " + num1);
		System.out.println("Number 2 is: " + num2);
		if(num1<num2)
			System.out.println(num1+ " is smaller than " + num2);
		else
			System.out.println(num2+ " is smaller than " + num1);
	}
	
	public static void main(String args[]){
		Assignment13 assignment13 = new Assignment13();
		assignment13.findMaxNum(10,17);
		assignment13.findMinNum(10,17);
	}
}