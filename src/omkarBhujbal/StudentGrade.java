package omkarBhujbal;

public class StudentGrade {

    void printGrade(int score) {
        if (score > 90 && score <= 100) {
            System.out.println("A+");
        } else if (score > 80 && score <= 90) {
            System.out.println("A");
        } else if (score > 70 && score <= 80) {
            System.out.println("B+");
        } else if (score > 60 && score <= 70) {
            System.out.println("B");
        } else if (score >= 50 && score <= 60) {
            System.out.println("C");
        } else if (score > 0 && score < 50) {
            System.out.println("work harder");
        } else {
            System.out.println("Invalid score");
        }
    }

    public static void main(String[] args) {
        StudentGrade sg = new StudentGrade();
        sg.printGrade(92);
        sg.printGrade(76);
        sg.printGrade(23);
        sg.printGrade(-19);
        sg.printGrade(102);
        sg.printGrade(0);
    }
}
