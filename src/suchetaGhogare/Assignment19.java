package suchetaGhogare;

public class Assignment19 {
	
	int getFirstNumDiv(int startRange, int endRange) {
		int getFirstNum = 0;
		for(int i=startRange; i<=endRange; i++) {
			if (i%7==0) {
				getFirstNum = i;
				break;
			}
		}
		if (getFirstNum!=0) {
			System.out.println("Range "+ startRange+ " to " + endRange + " : ");
			System.out.println("First number divisible by 7 is: " +getFirstNum);
		}
		else {
			System.out.println("Invalid range or number");
		}
		return -1;
	}
	
	int getSecondNumDiv(int startRange, int endRange) {
		int count = 0;
		int getSecondNum = 0;
		for(int i=startRange; i<=endRange; i++) {
			if (i%7==0) {		
				count++;
				if (count == 2) {
					getSecondNum = i;
					break;
				}	
			}
		}		
		if ((getSecondNum!=0) && (count!=0)) {
			System.out.println("Range "+ startRange+ " to " + endRange + " : ");
			System.out.println("Second last number divisible by 7 is : " +getSecondNum);
		}
		else {
			System.out.println("Invalid range or number");
		}
		return -1;
	}
	
	int getNthNumDiv(int startRange, int endRange, int nth) {
		int count = 0;
		int getNthNum = 0;
		for(int i=startRange; i<=endRange; i++) {
			if (i%7==0) {		
				count++;
				if (count == nth) {
					getNthNum = i;
					break;
				}	
			}	
		}
		if ((getNthNum!=0) && (count!=0)) {
			System.out.println("Range "+ startRange+ " to " + endRange + " : ");
			System.out.println(nth + "th number divisible by 7 is : " +getNthNum);
		}
		else {
			System.out.println("Invalid range or number");
		}
		return -1;
	}
	
	int getLastNumDiv(int startRange, int endRange) {
		int getLastNum = 0;
		for(int i=endRange; i>=startRange; i--) {
			if (i%7==0) {
				getLastNum = i;
				break ;
			}		
		}
		if (getLastNum!=0) {
			System.out.println("Range "+ startRange+ " to " + endRange + " : ");
			System.out.println("Last number divisible by 7 in given range is: " +getLastNum);			
		}
		else {
			System.out.println("Invalid range or number");
		}
		return -1;
	}
	
	int getSecondLastNumDiv(int startRange, int endRange) {
		int count = 0;
		int getSecondLast = 0;
		for(int i=endRange; i>=startRange; i--) {
			if (i%7==0) {		
				count++;
				if (count == 2){
					getSecondLast = i;
					break;
				}	
			}
		}
		if ((getSecondLast!=0) && (count!=0)) {
			System.out.println("Range "+ startRange+ " to " + endRange + " : ");
			System.out.println("Second last number divisible by 7 in given range is : " +getSecondLast);
		}
		else {
			System.out.println("Invalid range or number");
		}
		return -1;
	}
	
	int getNthLastNumDiv(int startRange, int endRange, int nth) {
		int count = 0;
		int getNthLastNum = 0;
		for(int i=endRange; i>=startRange; i--) {
				if (i%7==0) {		
					count++;
					if (count == nth) {
						getNthLastNum = i;
						break;
					}	
				}	
			}
			if ((getNthLastNum!=0) && (count!=0)) {
				System.out.println("Range "+ startRange+ " to " + endRange + " : ");
				System.out.println(nth + "rd number divisible by 7 is : " +getNthLastNum);
			}
			else {
				System.out.println("Invalid range or number");
			}
		return -1;
	}

	public static void main(String[] args) {
		Assignment19 assignment19 = new Assignment19();	
		assignment19.getFirstNumDiv(1,50);
		System.out.println("-----------------------------------------------------------------");
		assignment19.getSecondNumDiv(1,15);
		System.out.println("-----------------------------------------------------------------");
		assignment19.getNthNumDiv(1,100,4);
		System.out.println("-----------------------------------------------------------------");
		assignment19.getLastNumDiv(1,120);
		System.out.println("-----------------------------------------------------------------");
		assignment19.getSecondLastNumDiv(1,99);
		System.out.println("-----------------------------------------------------------------");
		assignment19.getNthLastNumDiv(1,50,3);
		System.out.println("-----------------------------------------------------------------");
	}
}
