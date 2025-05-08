package nitinSharma;

public class NumberDiv {

	int getFirstDivNum(int start, int end) {
		int ans = 0;
		for (int num = start; num <= end; num++) {
			if (num % 7 == 0) {
				System.out.println("The first number divisible by 7 is: " + (ans =num));
				break;
			}
		}
		return ans;
	}

	int getSecondDivNum(int start, int end) {
		int ans = 0;
		int count = 0;
		for (int num = start; num <= end; num++) {

			if (num % 7 == 0) {
				count++;
				if (count == 2) {
					System.out.println("The second number divisible by 7 is: " + num);
					break;
				}
			}
		}
		return ans;
	}

	int getNthDivNum(int start, int end, int nth) {
		int ans = 0;
		int count = 0;
		for (int num = start; num <= end; num++) {

			if (num % 7 == 0) {
				count++;
				if (count == nth) {
					System.out.println("The nth number divisible by 7 is: " + num);
					break;
				}
			}
		}
		return ans;
	}

	int getLastDivNum(int start, int end) {
		int ans = 0;
		int count = 0;
		for (int num = end; num >= start; num--) {
			if (num % 7 == 0) {
				System.out.println("The last number divisible by 7 is: " + num);
				break;

			}
		}
		return ans;
	}
	int getSecondLastDivNum(int start, int end) {
		int ans = 0;
		int count = 0;
		for (int num = end; num >= start; num--) {
			if (num % 7 == 0) {
				count++;
				if(count == 2) {
				System.out.println("The 2ndlast number divisible by 7 is: " + num);
				break;

			}
				}
		}
		return ans;
	}
	int getNthLastDivNum(int start, int end, int nth) {
		int ans = 0;
		int count = 0;
		for (int num = end; num >= start; num--) {
			if (num % 7 == 0) {
				count++;
				if(count == nth) {
				System.out.println("The nthlast number divisible by 7 is: " + num);
				break;

			}
				}
		}
		return ans;
	}

	public static void main(String[] args) {
		NumberDiv numDiv = new NumberDiv();
		numDiv.getFirstDivNum(10, 50);
		numDiv.getSecondDivNum(10, 50);
		numDiv.getNthDivNum(1, 100, 4);
		numDiv.getLastDivNum(10, 50);
		numDiv.getSecondLastDivNum(10, 50);
		numDiv.getNthLastDivNum(1, 100, 4);
		
	}

}
