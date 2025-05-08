package najneenMalgave;

class StudentGrade{
	
	void printGrade(int score){
		if(score > 90 || score <= 100){
			System.out.println("You have passed with A+ grade");
		}else if(score > 80 || score <= 90){
			System.out.println("You have passed with A grade");
		}else if(score > 70 || score <= 80){
			System.out.println("You have passed with B+ grade");
		}else if (score > 60 || score <= 70){
			System.out.println("You have passed with B grade");
		}else if (score >= 50 || score <= 60){
			System.out.println("You have passed with C grade");
		}else if(score < 50 || score >= 0 ){
			System.out.println("Work harder");
		}else{
			System.out.println("Invalid Score");
		}	
	}
	
	public static void main(String[] args){
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.printGrade(40);
	}
}