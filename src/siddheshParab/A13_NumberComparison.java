package siddheshParab;

class A13_NumberComparison {

    static int findMinimum(int num1, int num2) {
        return (num1 < num2) ? num1 : num2;
    }

    static int findMaximum(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 17;

        int smaller = findMinimum(num1, num2);
        int bigger = findMaximum(num1, num2);

        System.out.println(smaller + " is smaller & " + bigger + " is bigger from " + num1 + " and " + num2 + ".");
    }
}
