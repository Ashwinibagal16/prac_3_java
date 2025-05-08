package rahulAlagoudar;

class DayIndex{
  int day;
  
  void indDay(int day){
    if(day>=1 && day <=7){
      System.out.println("input :"+day);
      if(day>=1 && day<=5){
        System.out.println("Its Weekday");
        if(day==1){
          System.out.println("Its Monday");
        }else if(day==2){
          System.out.println("Its Tuesday");
        }else if(day==3){
          System.out.println("Its Wednesday");
        }else if(day==4){
          System.out.println("Its Thursday");
        }else{
          System.out.println("Its Friday");
        }
      }else{
        System.out.println("Its Weekend");
        if(day==6){
          System.out.println("Its Saturday");
        }else{
          System.out.println("Its Sunday");
        }
      }
    }else{
      System.out.println(day+" is Invalid day");
    }
  }
  public static void main(String[] args){
    DayIndex d= new DayIndex();
    d.indDay(6);
    d.indDay(5);
  }
}