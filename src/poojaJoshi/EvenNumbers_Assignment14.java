package poojaJoshi;

class EvenNumbers_Assignment14{
	
	void printEvenNumbers(int start, int end){
		System.out.println("Even numbers are:");
		for (int i = start; i <=end ; i++){
			if (i % 2==0){
				System.out.println(i);
			}
		}
	}
		
		public static void main(String[]args){
			EvenNumbers_Assignment14 evenNumber = new EvenNumbers_Assignment14();
			evenNumber.printEvenNumbers(10,15);
		}
	}	