package poojaJoshi;

class DivNumber{
    
    void processData(){
        for (int num = 1; num<=100; num++){
            if(num %5== 0 && num %7==0){
                System.out.println(num+" is diisible by 5 & 7 " );
            }else if (num % 5==0){
                System.out.println(num+" is diisible by 5 ");
            }else if (num %7==0){
                System.out.println(num+" is diisible by 7 ");
			}
        }
    }
    
    public static void main(String[] args){
			DivNumber div = new DivNumber();
			div.processData();
	}
}
    