package md.tekwillacademy.operationsandciclicfunctions;

public class GradeSystemService {
    public static void main(String[] args) {
        int score = 81;
        if (score >= 90) {
            System.out.println("You're grade is 'A'.");
        } else if (score >= 80) {
            System.out.println("You're grade is 'B'.");
        } else if (score >= 70) {
            System.out.println("You're grade is 'C'.");
        } else if (score >= 60) {
            System.out.println("You're grade is 'D'.");
        } else {
            System.out.println("You did not pass the exam.");
        }
    }
}
