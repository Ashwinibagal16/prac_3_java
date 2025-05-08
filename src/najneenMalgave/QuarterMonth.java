package najneenMalgave;

class QuarterMonth{
	
	void processData(int monthIndex){
		if(monthIndex==1){
			System.out.println("Month index "+ monthIndex + " is in Q1, its January");
		}else if(monthIndex==2){
			System.out.println("Month index "+ monthIndex + " is in Q1, its February");
		}else if(monthIndex==3){
			System.out.println("Month index "+ monthIndex + " is in Q1, its March");
		}else if(monthIndex==4){
			System.out.println("Month index "+ monthIndex + " is in Q2, its April");
		}else if(monthIndex==5){
			System.out.println("Month index "+ monthIndex + " is in Q2, its May");
		}else if(monthIndex==5){
			System.out.println("Month index "+ monthIndex + " is in Q2, its June");
		}else if(monthIndex==7){
			System.out.println("Month index "+ monthIndex + " is in Q3, its July");
		}else if(monthIndex==8){
			System.out.println("Month index "+ monthIndex + " is in Q3, its August");
		}else if(monthIndex==9){
			System.out.println("Month index "+ monthIndex + " is in Q3, its September");
		}else if(monthIndex==10){
			System.out.println("Month index "+ monthIndex + " is in Q4, its October");
		}else if(monthIndex==11){
			System.out.println("Month index "+ monthIndex + " is in Q4, its November");
		}else if(monthIndex==12){
			System.out.println("Month index "+ monthIndex + " is in Q4, its December");
		}else if(monthIndex <= 0){
			System.out.println("Invalid month index, it can't be negative");
		}else if(monthIndex > 12){
			System.out.println("Invalid month index, it can't be greater than 12");
		}
	}
	
	public static void main(String[] args){
		QuarterMonth quarterMonth = new QuarterMonth();
		quarterMonth.processData(5);
		quarterMonth.processData(2);
		quarterMonth.processData(-3);
		quarterMonth.processData(13);
	}
}