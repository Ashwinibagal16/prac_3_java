package suchetaGhogare;

class NumForLoop{
	
	void processNumForLoop(){
		for(int num=1; num<=100; num++){
			if ((num%5==0) && (num%7==0)){
				System.out.println(num + " is divisible by both");
			}else if(num%5==0){
					System.out.println(num + " is divisible by 5");
			}else if (num%7==0){
					System.out.println(num + " is divisible by 7");
			}
		}
	}

	public static void main(String[] args){
		NumForLoop numForLoop = new NumForLoop();
		numForLoop.processNumForLoop();
	}
}