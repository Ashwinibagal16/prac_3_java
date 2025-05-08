package jayaSahu;

public class DivisionBy7 {
	int firstDivisibleNumber(int start, int end) {
        for (int num = start; num <= end; num++) {
            if (num % 7 == 0) {
                return num;
            }
        }
        return -1;
    }

    int secondDivisibleNumber(int start, int end) {
        int count = 0;
        for (int num = start; num <= end; num++) {
            if (num % 7 == 0) {
                count++;
                if (count == 2) {
                   return num;
                }
            }
        }
		return -1;
    }

    int nthDivisibleNumber(int start, int end, int nth) {
        int count = 0;
        for (int num = start; num <= end; num++) {
            if (num % 7 == 0) {
                count++;
                if (count == nth) {
                    return num;
                }
            }
        }
		return -1;
    }

    int lastDivisibleNumber(int start, int end) {
        for (int num = end; num >= start; num--) {
            if (num % 7 == 0) {
                return num;
            }
        }
        return -1;
    }

    int secondLastDivisibleNumber(int start, int end) {
        int count = 0;
        for (int num = end; num >= start; num--) {
            if (num % 7 == 0) {
                count++;
                if (count == 2) {
                    return num;
                }
            }
        }
		return -1;
    }

    int lastNthDivisibleNumber(int start, int end, int nth) {
        int count = 0;
        for (int num = end; num >= start; num--) {
            if (num % 7 == 0) {
                count++;
                if (count == nth) {
                    return num;
                }
            }
	    }
		return -1;
	}	

        public static void main(String[] args) {
			DivisionBy7 division = new DivisionBy7();
			int n = 4;
            int nLast = 3;			
            int first = division.firstDivisibleNumber(1, 100);
            int second = division.secondDivisibleNumber(1, 100);
            int nth = division.nthDivisibleNumber(1, 100, 4);
            int last = division.lastDivisibleNumber(1, 100);
            int secondLast = division.secondLastDivisibleNumber(1, 100);
            int nthLast = division.lastNthDivisibleNumber(1, 100, 3);

            System.out.println("first divisible by 7: " + first);
            System.out.println("second divisible by 7: " + second);
            System.out.println(n + " th divisible by 7 in the range is: " + nth);
            System.out.println("last divisible by 7 :" + last);
            System.out.println("Second last divisible by 7: " + secondLast);
            System.out.println(nLast + "th last divisible by 7 in the range is: " + nthLast);
        }
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


