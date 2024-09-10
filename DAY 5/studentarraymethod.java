import java.util.Scanner;
class student{
    String student_name;
    int homework_grade;
    int exam_grade;
    double average_grade;
    public student(String student_name,int homework_grade,int exam_grade,double average_grade){
        this.student_name=student_name;
        this.homework_grade=homework_grade;
        this.exam_grade=exam_grade;
        this.average_grade=average_grade;
    }
    public void studentdetails(){
        System.out.println("STUDENT NAME:"+student_name);
        System.out.println("STUDENT HOMEWORK GRADE:"+homework_grade);
        System.out.println("STUDENT FINAL EXAM GRADE:"+exam_grade);
        System.out.println("STUDENT AVERAGE GRADE:"+average_grade);
    }
}
public class StudentArrayMethod{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        student[] obj = new student[2];
        for(int i=0;i<2;i++){
            System.out.println("ENTER THE STUDENT DETAILS"+(i+1));
            System.out.print("ENTER THE STUDENT  NAME:");
            String student_name=scanner.nextLine();
            System.out.print("ENYTER THE STUDENT HOMEWORK GRADE:");
             int homework_grade=scanner.nextInt();
             System.out.print("ENYTER THE STUDENT FINAL GRADE:");
             int exam_grade=scanner.nextInt();
             double average_grade=(homework_grade+exam_grade)/2.0; 
             scanner.nextLine();
             obj[i] = new student(student_name,homework_grade,exam_grade,average_grade);
        } 
        for(student students:obj){
            students.studentdetails();
            System.out.println();
        }
        scanner.close();
    }
}
