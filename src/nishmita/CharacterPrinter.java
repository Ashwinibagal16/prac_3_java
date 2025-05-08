//A-17
package nishmita;
class CharacterPrinter {
    void printCharacters(String input) {
        for (int index = 0; index < input.length(); index++) {
            System.out.println(index + "-->" + input.charAt(index));
        }
    }
   
    public static void main(String[] args) {
		CharacterPrinter characterPrinter = new CharacterPrinter();
        String input = "techno";
        characterPrinter.printCharacters(input);
    }
}