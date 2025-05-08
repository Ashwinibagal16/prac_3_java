package yogeshGhuge;

public class Assignment_11 {
	
	void weeks(int days) {
		
		if(days>=1 && days<=7) {
			if(days>=1 && days<=5) {
				System.out.println("Its weekdays");
			}if(days==1) {
				System.out.println("Monday");
			}else if(days==2) {
				System.out.println("Tuesday");
			}else if(days==3) {
				System.out.println("Wensdays");
			}else if(days==4) {
				System.out.println("Thursday");
			}else if(days==5) {
				System.out.println("Friday");
			}else if(days>=6 && days<=7) {
				System.out.println("Its weekend");
			} if(days==6) {
				System.out.println("Saturday");
			}else if(days==7) {
				System.out.println("Sunday");
			}
		}else {
			System.out.println("invalid input");
		}
	}
	
	public static void main (String [] args) {
		Assignment_11 assign_11 = new Assignment_11();
		assign_11.weeks(3);
		assign_11.weeks(7);
		assign_11.weeks(9);
		
	}

}
