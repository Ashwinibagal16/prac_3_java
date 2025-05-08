package shubhamMandavgane;
class StudentGrade{
	
	void grade(int marks){
		if(marks>90 && marks<= 100){
			System.out.println("A+");
		}else if(marks>80 && marks<= 90){
			System.out.println("A");
		}else if(marks>70 && marks<= 80){
			System.out.println("B+");
		}else if(marks>60 && marks<= 70){
			System.out.println("B");
		}else if(marks>50 && marks<= 60){
			System.out.println("C");
		}else if(marks>=0 && marks< 50){
			System.out.println("Work Harder");
		}else{
			System.out.println("Invalid Score");
		}
	}
	
	public static void main(String[] args){
		StudentGrade studentgrade = new StudentGrade();
		studentgrade.grade(92);
		studentgrade.grade(76);
		studentgrade.grade(23);
		studentgrade.grade(-19);
		studentgrade.grade(102);
	}
		
	
}