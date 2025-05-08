package tejasKurhade;

public class Assignment19 {

	int firstDivNumber(int sRange, int eRange) {
		int ans = 0;
		for (int num = sRange; num <= eRange; num++) {
			if (num % 7 == 0) {
				ans = num;
				return ans;
			}
		}
		return -1;
	}

	int secDivNumber(int sRange, int eRange) {
		int ans = 0;
		int count = 0;
		for (int num = sRange; num <= eRange; num++) {
			if (num % 7 == 0) {
				count++;
				if (count == 2) {
					ans = num;
					return ans;
				}
			}
		}
		return -1;
	}

	int nthDivNumber(int sRange, int eRange, int n) {
		int ans = 0;
		int count = 0;
		for (int num = sRange; num <= eRange; num++) {
			if (num % 7 == 0) {
				count++;
				if (count == n) {
					ans = num;
					return ans;
				}
			}
		}
		return -1;

	}

	int lastDivNumber(int sRange, int eRange) {
		int ans = 0;
		for (int num = eRange; num >= sRange; num--) {
			if (num % 7 == 0) {
				ans = num;
				return ans;
			}
		}
		return -1;
	}

	int secLastDivNumber(int sRange, int eRange) {
		int ans = 0;
		int count = 0;
		for (int num = eRange; num >= sRange; num--) {
			if (num % 7 == 0) {
				count++;
				if (count == 2) {
					ans = num;
					return ans;
				}
			}
		}
		return -1;
	}

	int nthLastDivNumber(int sRange, int eRange, int n) {
		int ans = 0;
		int count = 0;
		for (int num = eRange; num >= sRange; num--) {
			if (num % 7 == 0) {
				count++;
				if (count == n) {
					ans = num;
					return ans;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Assignment19 assignment19 = new Assignment19();
		int value1 = assignment19.firstDivNumber(10, 50);
		int value2 = assignment19.secDivNumber(10, 50);
		int value3 = assignment19.nthDivNumber(10, 50, 3);
		int value4 = assignment19.lastDivNumber(10, 50);
		int value5 = assignment19.secLastDivNumber(10, 50);
		int value6 = assignment19.nthLastDivNumber(10, 50, 3);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
	}

}
