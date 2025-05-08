//A-18
package nishmita;
class CharacterFrequency {
    void printFrequency(String input) {
        int count = 0;
        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index) == 'e') {
                count++;
            }
        }
        System.out.println("e--> " + count);
    }

    public static void main(String[] args) {
        CharacterFrequency characterFrequency = new CharacterFrequency();
        String input = "technocredits";
        characterFrequency.printFrequency(input);
    }
}
