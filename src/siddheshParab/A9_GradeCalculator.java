package siddheshParab;

class A9_GradeCalculator {

    String getGrade(int score) {
        if (score < 0 || score > 100) {
            return "Invalid score";
        } else if (score > 90) {
            return "A+";
        } else if (score > 80) {
            return "A";
        } else if (score > 70) {
            return "B+";
        } else if (score > 60) {
            return "B";
        } else if (score >= 50) {
            return "C";
        } else {
            return "work harder";
        }
    }

    public static void main(String[] args) {
        A9_GradeCalculator calculator = new A9_GradeCalculator();
        
        System.out.println("Score: 92 -> " + calculator.getGrade(92));
        System.out.println("Score: 76 -> " + calculator.getGrade(76));
        System.out.println("Score: 23 -> " + calculator.getGrade(23));
        System.out.println("Score: -19 -> " + calculator.getGrade(-19));
        System.out.println("Score: 102 -> " + calculator.getGrade(102));
    }
}

