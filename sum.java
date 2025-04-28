import java.util.Scanner;
public class sum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum;
        sum=((n*(n+1))/2);
        System.out.println("Sum of natural numbers:"+sum);
    } 
}
