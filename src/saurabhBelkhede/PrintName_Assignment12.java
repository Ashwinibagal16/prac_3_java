package saurabhBelkhede;
//Assignment 12
class PrintName {

	void print(){
		for (int count=1; count <=5; count++){
			System.out.println("Saurabh - " + count);
		}
	}
		
	public static void main(String[] args) {
		PrintName prt = new PrintName();
		prt.print();
	}
}