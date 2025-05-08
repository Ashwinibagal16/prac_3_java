package rahulAlagoudar;

class Comparison{
  int num1;
  int num2;
  
  void smallNum(int num1, int num2){
    if(num1<num2){
      System.out.println(num1+" is smallest number between "+num1+" and "+num2);
    }else {
      System.out.println(num2+" is smallest number between "+num1+" and "+num2);
    }
  }
  
  void largeNum(int num1, int num2){
    if(num1>num2){
      System.out.println(num1+" is Largest number between "+num1+" and "+num2);
    }else {
      System.out.println(num2+" is Largest number between "+num1+" and "+num2);
    }
  }
  
  public static void main(String[] args){
    Comparison comp=new Comparison();
    comp.smallNum(5,10);
    comp.largeNum(10,15);
  }
}