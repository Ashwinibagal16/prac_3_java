package rahulAlagoudar;

class StudentGrade{
  int marks;
  String grade;
  
  void grade(int marks){
    if(marks>90 && marks<=100){
      System.out.println("Marks: "+marks);
      System.out.println("Grade: A++");
    }else if(marks>80 && marks <=90){
      System.out.println("Marks: "+marks);
      System.out.println("Grade: A");
    }else if(marks>70 && marks<=80){
      System.out.println("Marks: "+marks);
      System.out.println("Grade: B+");
    }else if(marks>60 && marks<=70){
      System.out.println("Marks: "+marks);
      System.out.println("Grade: B");
    }else if(marks>=50 && marks<=60){
      System.out.println("Marks: "+marks);
      System.out.println("Grade: C");
    }else if(marks>=0 && marks<50){
      System.out.println("Marks: "+marks);
      System.out.println("Grade: Work Harder");
    }else{
      System.out.println("Your input is invalid");
    }
    System.out.println();
  }
  
  public static void main(String[] args){
    StudentGrade sg=new StudentGrade();
    sg.grade(25);
    sg.grade(60);
    sg.grade(78);
    sg.grade(88);
    sg.grade(99);
  }
}