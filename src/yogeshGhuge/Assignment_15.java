package yogeshGhuge;

public class Assignment_15 {

	void divNum(int startRange, int endRange) {
		//int count = 0;
		for (int num = startRange; num < endRange; num++) {
			if (num % 3 == 0 && num % 5 == 0) {
				System.out.println(num);
				//count = count++;
			}
		}
		//System.out.println(count);

	}

	public static void main(String[] args) {
		Assignment_15 assign_15 = new Assignment_15();
		assign_15.divNum(5, 40);

	}

}
/*In the given range 5 to 40, print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.*/
