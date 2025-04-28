import java.util.Scanner;
public class divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if (n%3!=0 && n%5!=0){
            System.out.println("Neither divisible by 3 and 5");
        }
        else{
            System.out.println("Divisible by 3 and 5");
        }
    }
}
