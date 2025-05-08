package ojaswini;
class Student{
 String name="techno";
 int rno=1;
 
 void display(){               //method1
  System.out.println(name);
  System.out.println(rno);
 }
 
 public static void main(String[] args){     //method2
  Student s=new Student();                   //student class ka new object
  s.display();                                  
 }
}