package siddheshParab;

class A12_NameWithCount {
    void printNameWithCount(String name) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " - " + i);
        }
    }

    public static void main(String[] args) {
        A12_NameWithCount instance = new A12_NameWithCount();
        instance.printNameWithCount("Siddhesh");
    }
}
