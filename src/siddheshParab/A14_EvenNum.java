package siddheshParab;

public class A14_EvenNum {
    static void printNumbers(int num1, int num2) {
        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
            	if (i%2 == 0) {
            		System.out.print(i + " ");
            	}
            }
        } else {
            for (int i = num1; i >= num2; i--) {
            	if (i%2 == 0) {
            		System.out.print(i + " ");
            	}
            }
        }
    }

    public static void main(String[] args) {
        printNumbers(10, 17);
        System.out.println();
        printNumbers(17, 10);
    }
}

