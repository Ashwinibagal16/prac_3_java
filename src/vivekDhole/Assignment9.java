package vivekDhole;

class Assignment9 {

	void studgrade(int score) {
		if(score > 90 && score <= 100){
			System.out.println("Student's Grade is A+");
		}else if(score > 80 && score <= 90) {
			System.out.println("Student's Grade is A");
		}else if(score > 70 && score <= 80) {
			System.out.println("Student's Grade is B+");
		}else if(score > 60 && score <= 70) {
			System.out.println("Student's Grade is B");
		}else if(score >= 50 && score <= 60) {
			System.out.println("Student's Grade is C");
		}else if(score >= 0 && score < 50) {
			System.out.println("Student must work harder");
		}else {
			System.out.println("Invalid score");
		}
	}	

		public static void main(String[] args) {
			Assignment9 studentgrades = new Assignment9();
			studentgrades.studgrade(92);
			studentgrades.studgrade(76);
			studentgrades.studgrade(23);
			studentgrades.studgrade(19);
			studentgrades.studgrade(102);
		}
}
	