//Assignment 17
package saurabhBelkhede;

public class Characters {
	
	void printStr(String str) {
		for(int index=0; index < str.length(); index++) {
			char ch= str.charAt(index);
			System.out.println(index + " holds " + ch);
		}	
	}
	
	public static void main(String[] args) {
		Characters chr= new Characters();
		chr.printStr("Saurabh");
	}
}

