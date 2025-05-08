package mayurKamble;

class NameCount{
	
	void DisplayName(String name){
		for(int i=1;i<=5;i++){
			System.out.println(name+" - "+i);
		}
	}
	
	public static void main(String[]args){
		NameCount nameCount= new NameCount();
		nameCount.DisplayName("Mayur");
	}
}