package nitinSharma;
class Example22{
	
	void processData(){
		for (int count = 1; count<=100; count++){
			 if (count%5 == 0 && count%7 == 0){
				System.out.println(count+ " number is divisible by 5 and 7 both");
			 }else if (count%5 == 0){
				System.out.println(count+ " number is divisible by 5");
			 }
			 else if(count%7 == 0){
				System.out.println(count+ " number is divisible by 7");
			 }
		 }
	 }
	public static void main(String[] args){
		Example22 example22 = new Example22();
			example22.processData();
	}
}