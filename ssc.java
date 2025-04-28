import java.util.Scanner;
public class ssc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        int marks;
        int sum=0;
        System.out.println("Enter the marks");
        for(int i=1;i<=5;i++){
                marks=sc.nextInt();
                sum += marks;
        }
        System.out.println("Total sum:"+sum);
        if (sum >=350){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
