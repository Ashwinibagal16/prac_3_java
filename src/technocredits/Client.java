package technocredits;

public class Client {
	static int num = 100;
	
	void display() {
		System.out.println(Example17.ans);
		Example17.m1();
		
		Example17 example17 = new Example17();
		example17.printNumbers(50,72);
		example17.printCountOfDivNumbers();
		System.out.println(example17.count);
	}
	
	public static void main(String[] args) {
		Client client = new Client();
		client.display();
	}
}
