package technocredits.returntype;

public class Example1 {
	
	int getFirstDivNum(int startR, int endR) {
		int ans = 0;
		for(int num=startR; num<=endR; num++) {
			if(num%7 == 0) {
				ans = num;
				break;
			}
		}
		return ans;
	}
	
	int getSecondDivNum(int startR, int endR, int nth) {
		int ans=0;
		int count = 0;
		
		for(int num=startR; num<=endR; num++) {
			if(num%7 == 0) {
				count++;
				if(count == nth) {
					ans = num;
					break;
				}
			}
		}
		//System.out.println(count);
		return ans;
	}
	
	
	int getSecondLastDivNum(int startR, int endR) {
		int ans=0;
		int count = 0;
		
		for(int num=startR; num<=endR; num++) {
			if(num%7 == 0) {
				count++;
			}
		}
		
		int temp = 0;
		for(int num=startR; num<=endR; num++) {
			if(num%7 == 0) {
				temp++;
				if(temp == count-1) {
					ans = num;
					break;
				}
			}
		}
		
		//System.out.println(count);
		return ans;
	}
	
	int getSecondLastDivNumFromRange(int startR, int endR) {
		int ans = 0;
		int count = 0;
		
		for(int num = endR; num >= startR; num--) {
			if(num%7 == 0) {
				count++;
				if(count == 2) {
					ans = num;
					break;
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Example1 example1 = new Example1();
		int num = example1.getSecondDivNum(1, 100, 9);
		System.out.println(num);
	}
}
