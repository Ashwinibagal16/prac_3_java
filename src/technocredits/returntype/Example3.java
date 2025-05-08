package technocredits.returntype;

public class Example3 {

	int getFirstDivNum(int startR, int endR) {
		for (int num = startR; num <= endR; num++) {
			if (num % 6 == 0) {
				return num;
			}
		}
		return -1;
	}
	
	int getSecondDivNum(int startR, int endR) {
		int count = 0;
		for (int num = startR; num <= endR; num++) {
			if (num % 6 == 0) {
				count++;
				if(count == 2)
					return num;
			}
		}
		return -1;
	}
	
	int getNthDivNum(int startR, int endR, int nth) {
		int count = 0;
		for (int num = startR; num <= endR; num++) {
			if (num % 6 == 0) {
				count++;
				if(count == nth)
					return num;
			}
		}
		return -1;
	}
	
	int getLastDivNum(int startR, int endR) {
		for (int num = endR; num >= startR; num--) {
			if (num % 6 == 0) {
				return num;
			}
		}
		return -1;
	}
	
	int getSecondLastDivNum(int startR, int endR) {
		int count = 0;
		
		for (int num = endR; num >= startR; num--) {
			if (num % 6 == 0) {
				count++;
				if(count == 2)
					return num;
			}
		}
		return -1;
	}
	
	int getNthLastDivNum(int startR, int endR, int nth) {
		int count = 0;
		
		for (int num = endR; num >= startR; num--) {
			if (num % 6 == 0) {
				count++;
				if(count == nth)
					return num;
			}
		}
		return -1;
	}
	
	int getIndex(String name) {
		int count = 0;
		for(int index=0;index<name.length();index++) {
			char ch = name.charAt(index);
			if(ch == 'a') {
				count++;
				if(count == 3) {
					return index;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Example3 example3 = new Example3();
		int ans = example3.getFirstDivNum(50, 100);
		System.out.println(ans);
	}
}
