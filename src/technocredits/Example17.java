package technocredits;

public class Example17 {
	int count = 0;
	Example17 ex = new Example17();
	static int ans = 10;
	
	static void m1() {
	
	}
	
	void printlargestDivNum(int startRange, int endRange) {
		int max = 0;
		int count = 0;
		int sum = 0;
		for(int num=startRange;num<=endRange;num++) {
			if(num%7==0) {
				max = num;
				count++;
				sum = sum + num;
				System.out.println(num + " is div by 7");
			}
		}
		System.out.println(max + " is maximum within the range which is div by 7");
		System.out.println("Total " + count + " are divible by 7 withing range");
		System.out.println(sum + " of all div numbers withing range");
		System.out.println((sum/count) + " is the average of numbers div by 7 withing range");
	}
	
	void printNumbers(int startRange,int endRange) {
		for(int num=startRange;num<=endRange;num++) {
			if(num%5==0) {
				System.out.println(num);
				count++;
			}
		}
	}
	
	void printCountOfDivNumbers() {
		System.out.println("There are total " + count + " div by 5 withing given range");
	}
	
}
