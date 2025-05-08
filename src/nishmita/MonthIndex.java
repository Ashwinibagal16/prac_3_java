//A-10
package nishmita;
class MonthIndex{
	void printMonthIndex(int index){
		String quarter;
		if(index>=1 && index<=12){
			if(index>=1 && index<=3){
				quarter="Q1";
				if(index==1){
					System.out.println("Month index " + index + " is in "+quarter+" ,it's January");
				}else if(index==2){
					System.out.println("Month index " + index + " is in "+quarter+" ,it's February");
				}else{
					System.out.println("Month index " + index + " is in "+quarter+" ,it's March");
				}
			}else if(index>=4 && index<=6){
				quarter="Q2";
				if(index==4){
					System.out.println("Month index " + index + " is in "+quarter+" ,it's April");
				}else if(index==5){
					System.out.println("Month index " + index + " is in "+quarter+" ,it's May");
				}else{
					System.out.println("Month index " + index + " is in "+quarter+" ,it's June");
				}
			}else if(index>=7 && index <=9){
				quarter="Q3";
				if(index==7){
					System.out.println("Month index " + index + " is in "+quarter+" ,it's July");
				}else if(index==8){
					System.out.println("Month index " + index + " is in "+quarter+" ,it's August");
				}else{
					System.out.println("Month index " + index + " is in "+quarter+" ,it's September");
				}
			}else{
				quarter="Q4";
				if(index==10){
					System.out.println("Month index " + index + " is in "+quarter+" ,it's October");
				}else if(index==11){
					System.out.println("Month index " + index + " is in "+quarter+" ,it's November");
				}else{
					System.out.println("Month index " + index + " is in "+quarter+" ,it's December");
				}
			}
		}else{
			if(index<=0){
				System.out.println("Invalid Month Index "+ index + " .It can't be less than 1");
			}else{
				System.out.println("Invalid Month Index "+ index + " .It can't be greater than 12");
			}
		}
	}

	public static void main(String[] args){
		MonthIndex monthIndex=new MonthIndex();
		monthIndex.printMonthIndex(6);
		monthIndex.printMonthIndex(1);
		monthIndex.printMonthIndex(15);
		monthIndex.printMonthIndex(8);
		monthIndex.printMonthIndex(12);
		monthIndex.printMonthIndex(0);
		monthIndex.printMonthIndex(-1);
	}
}

