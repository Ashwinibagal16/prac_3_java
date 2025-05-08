package rahulAlagoudar;

class Assignment15{
 int num1;
 int num2;
 
 void divNum(int num1, int num2){
   System.out.println("Divisible by 3 and 5 are:");
   for(int i=num1;i<=num2;i++){
     if(i%5==0 && i%3==0){
       System.out.println( i);
     }
   }
 }
 
 public static void main(String[] args){
   Assignment15 div=new Assignment15();
   div.divNum(5,40);
 }
}