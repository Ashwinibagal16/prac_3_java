package vaibhavPatil;

public class Assignment_17 {

	public static int printFreq(String input, char target) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
	public static void main(String[] args) {
		String userInput = "technocredits";  
        char target = 'e';
		int frequency = printFreq(userInput,target);
		System.out.println("Frequency of c is -> "+ frequency);
	}

}
