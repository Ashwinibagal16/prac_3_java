package shubhamMandavgane;
class MonthIndex{

	void monthIndex(int num){
		if(num>=1 && num<=12){
			if(num==1){
				System.out.println("Month index " + num + " is in Q1, its January");
			}else if(num==2){
				System.out.println("Month index " + num + " is in Q1, its February");
			}else if(num==3){
				System.out.println("Month index " + num + " is in Q1, its March");
			}else if(num==4){
				System.out.println("Month index " + num + " is in Q2, its April");
			}else if(num==5){
					System.out.println("Month index " + num + " is in Q2, its May");
			}else if(num==6){
					System.out.println("Month index " + num + " is in Q2, its June");
			}else if(num==7){
					System.out.println("Month index " + num + " is in Q3, its July");
			}else if(num==8){
					System.out.println("Month index " + num + " is in Q3, its August");
			}else if(num==9){
					System.out.println("Month index " + num + " is in Q3, its September");
			}else if(num==10){
					System.out.println("Month index " + num + " is in Q4, its October");
			}else if(num==11){
					System.out.println("Month index " + num + " is in Q4, its November");
			}else{
					System.out.println("Month index " + num + " is in Q4, its December");
				}		
		}
		else{
			if(num<1 || num==0){
			System.out.println("invalid month index, it can't be negative or zero. ");	
			}
			else{
			System.out.println("invalid month index, it can't be greater than " +num);		
			}
		}
	}
	
	public static void main(String[] args){
		MonthIndex monthindex = new MonthIndex();
		monthindex.monthIndex(5);
		monthindex.monthIndex(2);
		monthindex.monthIndex(-3);
		monthindex.monthIndex(13);
	}
}