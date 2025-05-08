//Assignment 14
package jeetHingrajiya;
public class EvenNumber {
	void evenNumberfind() {
		for(int num=10;num<=15;num++){
			if(num%2==0) {
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args) {
		EvenNumber evennumber = new EvenNumber();
		System.out.println("Even Numbers are");
		evennumber.evenNumberfind();
	}
}