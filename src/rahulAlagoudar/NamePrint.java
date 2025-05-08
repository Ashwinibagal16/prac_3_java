package rahulAlagoudar;

class NamePrint{
  int i;
  void loooop(){
    for(i=1;i<=5;i++){
      System.out.println("Rahul Alagoudar - "+i);
    }
  }
  public static void main(String[] args){
    NamePrint np=new NamePrint();
    np.loooop();
  }
}