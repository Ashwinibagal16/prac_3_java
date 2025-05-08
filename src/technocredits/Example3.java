package technocredits;

class Example3{
	
	int num1=10;
	int num2=20;
	
	void processData(){
		int num2=50;
		int ans = num1 + num2;
		System.out.println(ans);
	}
	
	void calculateNum(){
		int ans = num1 + num2;
		System.out.println(ans);
	}
	
	public static void main(String[] args){
		Example3 example3 = new Example3();
		example3.processData();
		example3.calculateNum();
	}
}