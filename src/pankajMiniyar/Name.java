//Assignment-12
package pankajMiniyar;
class Name{
	void printName(){
		for(int count=1;count<=5;count++){
			System.out.println("Pankaj - "+ count);
		}
	}
	
	public static void main(String[] args){
		Name name=new Name();
		name.printName();
	}
}
