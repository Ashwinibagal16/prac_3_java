package saurabhBelkhede;
//Assignment 9
class Grade {
	
	void grader(int score){
		if (score >0 && score <= 50){
			System.out.println(score + " work harder");
		}else if(score > 50 && score <=60){
			System.out.println(score + " is C");
		}else if(score > 60 && score <=70){
			System.out.println(score + " is B");
		}else if(score > 70 && score <80){
			System.out.println(score + " is B+");
		}else if(score > 70 && score <80){
			System.out.println(score + " is A");
		}else if(score > 80 && score <100){
			System.out.println(score + " is A+");
		}else{
			System.out.println(score + " is invalid score");
		}
	}
		
	public static void main(String[] args) {
		Grade grade=new Grade();
		grade.grader(25);
		grade.grader(55);
		grade.grader(65);
		grade.grader(75);
		grade.grader(85);
		grade.grader(105);
	}
}

	
	
	
	
	
	
	
	
	
	
	
	/*
		System.out.println("-----------------------");
		pt=56;
		grade.grader(pt);
		System.out.println("-----------------------");
		pt=65;
		grade.grader(pt);
		System.out.println("-----------------------");
		pt=75;
		grade.grader(pt);
		System.out.println("-----------------------");
		pt=85;
		grade.grader(pt);
		System.out.println("-----------------------");
		pt=95;
		grade.grader(pt);
		System.out.println("-----------------------");
		pt=101;
		grade.grader(pt);
		System.out.println("-----------------------"); */