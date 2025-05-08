package pratikWaghmare;

public class Assignment16 {
	
	int max, count, sum;
	
	void divisibleNumber(int start, int end) {
		
		System.out.println("Numbers divisible by 7 in range between " + start+ " and "+ end + " are:");
		
		for(int i = start; i<= end; i++) {
			
			if(i % 7 == 0) {
				
				max = i;
				sum = sum + i;
				count++;
				System.out.println(i + " ");
			}
		}
		
		System.out.println(max + " is greatest number divisisble by 7 in rage between" + start + " and "+ end);
		System.out.println(sum + " is summation of  numbers divisisble by 7 in rage between" + start + " and "+ end);
		System.out.println(count + " is count of number divisisble by 7 in rage between" + start + " and "+ end);
		System.out.println((sum/count) + " is average of numbers divisisble by 7 in rage between" + start + " and "+ end);
		
	}

	public static void main(String[] args) {
		Assignment16 assignment16 = new Assignment16();
		assignment16.divisibleNumber(1,50);
	}

}
