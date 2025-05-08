package vivekRahate;
class Example18{
	void processNumber(int num){
		if(num%5 == 0){
			System.out.println(num + " is divided by 5");
			
			if (num>=100&& num <1000){
				System.out.println("number has 3 digit");
			}
			else{
				System.out.println("number has not 3 digit");
			}
		}else{
				System.out.println(num + " is not divided by 5");
				int nearestNum = num - (num%5);
				System.out.println("Nearest number is divisible " + nearestNum);
		}
	}
	public static void main(String a[]){
		Example18 ex = new Example18();
		ex.processNumber(87);
		
	}
}
	
