package siddheshParab;

public class A16_DivisibleByAnyNumber {
    public static void printNumbersDivisibleBy(int start, int end, int divisor) {
        int count = 0;
        int maxNum = -1;
        int sum = 0;

        System.out.print("Numbers divisible by " + divisor + " in the range " + start + " to " + end + ": ");

        for (int num = start; num <= end; num++) {
            if (num % divisor == 0) {
                System.out.print(num + " ");
                count++;
                sum += num;
                if (num > maxNum) {
                    maxNum = num;
                }
            }
        }
        System.out.println(); // Move to new line after printing numbers

        float avg = (count > 0) ? (float) sum / count : 0;

        System.out.println("Count of numbers divisible by " + divisor + ": " + count);
        System.out.println("Maximum number divisible by " + divisor + ": " + maxNum);
        System.out.println("Sum of all numbers divisible by " + divisor + ": " + sum);
        System.out.println("Average of numbers divisible by " + divisor + ": " + avg);
    }
}
