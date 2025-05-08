package jayaSahu;

class DivisibleCheck{
	
	void checkDivisibility(int number) {
        if (number % 5 == 0 && number % 7 == 0) {
            System.out.println(number + " is div by 5 and 7");
        } else if (number % 5 == 0) {
            System.out.println(number + " is div by 5");
        } else if (number % 7 == 0) {
            System.out.println(number + " is div by 7");
        }
    }

    public static void main(String[] args) {
		DivisibleCheck div = new DivisibleCheck();
		   for (int i = 1; i <= 100; i++) {
            div.checkDivisibility(i);
        }
    }
}	
