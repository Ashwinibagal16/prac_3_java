package yogitaChaudhari;

public class Assignment_12 {
	
		
		void gradeOfStudent(int marks){
			if(marks > 90 && marks <= 100){
				System.out.println("Congratulation you got A+");
			}
			else if(marks >80 && marks <= 90){
				System.out.println("Congratulation you got A");
			} 
			else if(marks > 70 && marks <= 80){
				System.out.println("Congratulation you got B+");
			}
			else if(marks > 60 && marks <= 70){
				System.out.println("Congratulation you got B");
			}
			else if(marks > 50 && marks <= 60){
				System.out.println("Congratulation you got C");
			}
			else if(marks > 0 && marks <= 50){
				System.out.println("Work harder");
			}
			else{
				System.out.println("Any other score should be considered as Invalid score.");
				
			}
			
		}
		public static void main(String [] args){
			Assignment_12 studentGrade = new Assignment_12();
			studentGrade.gradeOfStudent(92);
			studentGrade.gradeOfStudent(76);
			studentGrade.gradeOfStudent(23);
			studentGrade.gradeOfStudent(19);
			studentGrade.gradeOfStudent(102);
			
		}




	
}
