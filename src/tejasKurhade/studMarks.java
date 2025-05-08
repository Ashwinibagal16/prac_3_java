package tejasKurhade;

class studMarks{
	int limit1 = 90;
	int limit2 = 100;
	int grade = 10;
	void checkRes(int marks){
		if (marks >limit1 && marks<limit2){
			 
			System.out.println("Student achieved grade " + grade);
		}
		else {
			limit1 -= 10;
			limit1 -= 20;
			grade--;
			checkRes(marks);
		}
	}
	public static void main(String[] args){
		studMarks studmarks = new studMarks();
		studmarks.checkRes(88);
	}
}
