//Assignment 12
package jeetHingrajiya;
class ForLoopName{
	
	void namePrint(){
		for(int name = 0;name<=5;name++){
			System.out.println("Jeet" + "-" +name);
		}
	}
	
	public static void main(String[]args){
		ForLoopName forloopname = new ForLoopName();
		forloopname.namePrint();
	}
}