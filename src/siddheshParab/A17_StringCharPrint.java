package siddheshParab;

public class A17_StringCharPrint {
    public static void main(String[] args) {
        String s = "Siddhesh";
        String p = "techno";
        String q = "I am in Pune.";
        
        printCharacters(s);
        System.out.println("_________");
        printCharacters(p);
        System.out.println("_________");
        printCharacters(q);
    }

    public static void printCharacters(String input) {
        for (int i = 0; i < input.length(); i++) {
            System.out.println(i + " -> " + input.charAt(i));
        }
    }
}

