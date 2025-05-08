//A-12
package nishmita;
class PrintName{
	void printName(){
		for(int count=1;count<=5;count++){
			System.out.println("NK - "+ count);
		}
	}

	public static void main(String[] args){
		PrintName name=new PrintName();
		name.printName();
	}
}