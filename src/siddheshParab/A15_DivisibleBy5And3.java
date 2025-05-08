package siddheshParab;

public class A15_DivisibleBy5And3 {
    
    static void printDivisibleBy5And3(int start, int end) {
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        
        System.out.print("Range "  + start + "-" + end +" numbers are: ");
        
        for (int i = start; i <= end; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static void main(String[] args) {
    	System.out.println("Divisible by 5 & 3,");
        printDivisibleBy5And3(5, 40);
        System.out.println();
        printDivisibleBy5And3(500, 40);
    }
}
