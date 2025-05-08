package anushreePatra;

class Score{
	 
	void studentGrade(int marks){
		if(marks>90 && marks<=100){
			System.out.println("A+");
		}else if(marks>80 && marks<=90){
			System.out.println("A");
		}else if(marks>70 && marks<=80){
			System.out.println("B+");
		}else if(marks>60 && marks<=70){
			System.out.println("B");
		}else if(marks>50 && marks<=60){
			System.out.println("C");
		}else if(marks>0 && marks<=50){
			System.out.println("Work harder");
		}else{
			System.out.println("Invalid score");
		}
	}
	
	public static void main(String[] args){
		Score score = new Score();
		score.studentGrade(92);
		score.studentGrade(76);
		score.studentGrade(33);
		score.studentGrade(-19);
		score.studentGrade(102);
		
	
	}
}