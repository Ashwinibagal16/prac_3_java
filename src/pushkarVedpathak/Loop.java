package pushkarVedpathak;

class Loop{

	void processData(String name){
		for(int num=1; num<=5; num++){
			System.out.println(name + " : " + num);
		}
	}
	
	public static void main(String[] args){
	Loop loop = new Loop();
	loop.processData("Pushkar");
	}
}