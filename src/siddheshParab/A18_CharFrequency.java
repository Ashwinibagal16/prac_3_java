package siddheshParab;

public class A18_CharFrequency {
    public static int findCharFrequency(String s, char target) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        String s = "technocredits";
        char target = 'e';

        int frequency = findCharFrequency(s, target);
        System.out.println("Frequency of '" + target + "' is: " + frequency);
    }
}