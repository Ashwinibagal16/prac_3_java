//Assignment-10
package pankajMiniyar;
class Month{
	void printMonthIndex(int index){
		String quarter;
		if(index>=1 && index<=12){
			if(index>=1 && index<=3){
				quarter="Q1";
				if(index==1){
					System.out.println("Month index " + index + " is in "+quarter+" ,its January");
				}else if(index==2){
					System.out.println("Month index " + index + " is in "+quarter+" ,its February");
				}else{
					System.out.println("Month index " + index + " is in "+quarter+" ,its March");
				}
			}else if(index>=4 && index<=6){
				quarter="Q2";
				if(index==4){
					System.out.println("Month index " + index + " is in "+quarter+" ,its April");
				}else if(index==5){
					System.out.println("Month index " + index + " is in "+quarter+" ,its May");
				}else{
					System.out.println("Month index " + index + " is in "+quarter+" ,its June");
				}
			}else if(index>=7 && index <=9){
				quarter="Q3";
				if(index==7){
					System.out.println("Month index " + index + " is in "+quarter+" ,its July");
				}else if(index==8){
					System.out.println("Month index " + index + " is in "+quarter+" ,its August");
				}else{
					System.out.println("Month index " + index + " is in "+quarter+" ,its September");
				}
			}else{
				quarter="Q4";
				if(index==10){
					System.out.println("Month index " + index + " is in "+quarter+" ,its October");
				}else if(index==11){
					System.out.println("Month index " + index + " is in "+quarter+" ,its November");
				}else{
					System.out.println("Month index " + index + " is in "+quarter+" ,its December");
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
		Month month=new Month();
		month.printMonthIndex(5);
		month.printMonthIndex(2);
		month.printMonthIndex(13);
		month.printMonthIndex(7);
		month.printMonthIndex(12);
		month.printMonthIndex(0);
		month.printMonthIndex(-1);
	}
}
		
	