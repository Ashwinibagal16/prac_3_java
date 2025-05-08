package shrutiPundikar;

public class Assignment16 {
	int count=0;
	
	void printGreatestDivNum(int startrange, int endrange) {
		int max = 0;
		int sum = 0;
		for(int num=startrange; num<=endrange;num++) {
			if(num%7==0) {
				max = num;
				count++;
				sum = sum + num;
				System.out.println(num+" is divisible by 7");			
				}
		}
		System.out.println(max+" is maximum within the range.");
		System.out.println("Total " + count +" numbers are divisible by 7 within the range.");
		System.out.println((sum/count)+" is the average of the numbers divisible by 7 within the range.");
		}
	
	public static void main(String[] args) {
		Assignment16 assignment_16 = new Assignment16();
		assignment_16.printGreatestDivNum(10, 70);
	}
}
