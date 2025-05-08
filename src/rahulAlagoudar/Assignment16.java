package rahulAlagoudar;

public class Assignment16 {
	
	int num1;
	int num2;
	
	void listDiv(int num1, int num2) {
		System.out.print("Numbers divisible by 7:");
		for(int i=num1;i<=num2;i++) {
			if(i%7==0) {
				System.out.print(" "+ i);
			}
		}
		System.out.println();
	}
	
	void maxNumDiv(int num1, int num2) {
		int maxnum=0;
		System.out.print("Max number divisible by 7:");
		for(int i=num1;i<=num2;i++) {
			if(i%7==0) {
				maxnum=i;
			}
		}
		System.out.println(" "+maxnum);
	}
	
	void sumNumDiv(int num1, int num2) {
		int sumNum=0;
		System.out.print("Sum of numbers divisible by 7:");
		for(int i=num1;i<=num2;i++) {
			if(i%7==0) {
				sumNum=sumNum+i;
			}
		}
		System.out.println(" "+sumNum);
	}
	
	void avgNumDiv(int num1, int num2) {
		int sumNum=0;
		int counter=0;
		int avg=0;
		System.out.print("Average of numbers divisible by 7:");
		for(int i=num1;i<=num2;i++) {
			if(i%7==0) {
				sumNum=sumNum+i;
				counter++;
			}
		}
		avg=sumNum/counter;
		System.out.println(" "+avg);
	}
	
	public static void main(String[] args) {
		Assignment16 assignment16=new Assignment16();
		assignment16.listDiv(10, 50);
		assignment16.maxNumDiv(10, 50);
		assignment16.sumNumDiv(10,50);
		assignment16.avgNumDiv(10,50);

	}

}
