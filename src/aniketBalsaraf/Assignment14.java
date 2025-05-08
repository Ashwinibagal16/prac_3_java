package aniketBalsaraf;

public class Assignment14 {

	void printEvenNum(int startNum, int endNum) {
		for (int index = startNum; index < endNum; index++) {
			if (index % 2 == 0) {
				System.out.println(index + " is an even number");
			} 
		}
	}

	public static void main(String[] args) {
		Assignment14 assignment14 = new Assignment14();
		assignment14.printEvenNum(10, 15);

	}

}
