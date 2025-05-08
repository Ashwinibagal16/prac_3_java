package rahulAlagoudar;

class Quarter{
  int month;
  
  void indexMonth(int month){
          System.out.println("Input is: "+month);
    if(month>=1 && month<=12){
      if(month>=1 && month<=3){
        if(month==1){
          System.out.println("Month index is "+month+" is in Q1, its January");
        }else if(month==2){
          System.out.println("Month index is "+month+" is in Q1, its February");
        }else{
          System.out.println("Month index is "+month+" is in Q1, its March");
        }
      }else if(month>=4 && month<=6){
        if(month==4){
          System.out.println("Month index is "+month+" is in Q2, its April");
        }else if(month==5){
        System.out.println("Month index is "+month+" is in Q2, its May");
        }else{
          System.out.println("Month index is "+month+" is in Q2, its June");
        }
      }else if(month>=7 && month==9){
        if(month==7){
          System.out.println("Month index is "+month+" is in Q3, its July");
        }else if(month==8){
          System.out.println("Month index is "+month+" is in Q3, its August");
        }else{
          System.out.println("Month index is "+month+" is in Q3, its September");
        }
      }else if(month>=10 && month<=12){
        if(month==10){
          System.out.println("Month index is "+month+" is in Q4, its October");
        }else if(month==11){
          System.out.println("Month index is "+month+" is in Q4, its November");
        }else{
          System.out.println("Month index is "+month+" is in Q4, its December");
        }
      }
    }else{
      System.out.println(month+" is invalid number");
    }
  }
  
  public static void main(String[] args){
    Quarter q=new Quarter();
    q.indexMonth(12);
    q.indexMonth(2);

  }
}