package technocredits;

class Example14{
	int num = 10;
	
	void isNumberValid(int num){
		if(num >= 0){
			System.out.println(num + " is a valid number");
		}else
			System.out.println(num + " is a not valid number");
		System.out.println("techno");
	}
	
	void add(int num1, int num2){
		int ans = num1 + num2;
//		sop("Addition is " + ans);
	}

	public static void main(String[] args){
		Example14 example14 = new Example14();
		example14.num = 100;
		example14.isNumberValid(45);
		example14.isNumberValid(-45);
		example14.isNumberValid(0);
		
//		example14.printStudentInfo("maulik", 15);
	}
}