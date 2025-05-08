//A-9
package nishmita;
class StudentGrade{
	void grade(int score){
		if(score > 90 && score<=100){
			System.out.println("Score:" + score + ", Grade: A+");
			System.out.println(" ");
		}else if(score > 80 && score<=90){
			System.out.println("Score:" + score +", Grade: A");
			System.out.println(" ");
		}else if(score > 70 && score<=80){
			System.out.println("Score:" + score +", Grade: B+");
			System.out.println(" ");
		}else if(score > 60 && score<=70){
			System.out.println("Score:" + score +", Grade: B");
			System.out.println(" ");
		}else if(score > 50 && score<=60){
			System.out.println("Score:" + score +", Grade: C");
			System.out.println(" ");
		}else if(score <= 50 && score>=0){
			System.out.println("Score:" + score +", Work Harder");
			System.out.println(" ");
		}else{
			System.out.println("Score:" + score + ", Invalid Score");
			System.out.println(" ");
		}
	}

	public static void main(String[] args){
		StudentGrade studentsGrade=new StudentGrade();
		studentsGrade.grade(92);
		studentsGrade.grade(76);
		studentsGrade.grade(23);
		studentsGrade.grade(52);
		studentsGrade.grade(-1);
		studentsGrade.grade(101);
	}
}