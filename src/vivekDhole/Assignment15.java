package vivekDhole;

class Assignment15 {

	void numDiv() {
		for(int num = 5; num <=40; num++) {
			if(num % 3 == 0 && num % 5 == 0) {
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args){
		Assignment15 assignment15 = new Assignment15();
		System.out.println("Numbers that are divisible by 3 and 5 are ");
		assignment15.numDiv();

	}
}