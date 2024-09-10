import java.util.Scanner;

class Student {
    private int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
            System.out.println("Grade successfully set to: " + grade);
        } else {
            System.out.println("Error: Grade must be between 0 and 100. Grade not changed.");
        }
    }
}

public class StudentGradeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Enter a valid grade (0-100) for the student:");
        int validGrade = scanner.nextInt();
        student.setGrade(validGrade);
        System.out.println("Current grade: " + student.getGrade());
        System.out.println("Enter an invalid high grade (>100) for the student:");
        int invalidHighGrade = scanner.nextInt();
        student.setGrade(invalidHighGrade);
        System.out.println("Current grade: " + student.getGrade());
        System.out.println("Enter an invalid low grade (<0) for the student:");
        int invalidLowGrade = scanner.nextInt();
        student.setGrade(invalidLowGrade);
        System.out.println("Current grade: " + student.getGrade());

        scanner.close();
    }
}