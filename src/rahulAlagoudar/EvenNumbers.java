package rahulAlagoudar;

class EvenNumbers{
  int num1;
  int num2;
  
  void EvenNumbersPrint(int num1, int num2){
    for(int i=num1;i<=num2;i++){
      if(i%2==0){
        System.out.println("even number: "+i);
      }
    }
  }
  
  public static void main(String[] args){
    EvenNumbers en=new EvenNumbers();
    en.EvenNumbersPrint(10,15);
  }
}