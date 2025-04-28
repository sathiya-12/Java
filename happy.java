import java.util.*;
class happy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r=0;
        int d;
        int n = sc.nextInt();
        while (n>1){
            d = n%10;
            r += d*d;
            n /=10;
            r=n;
        }
        if(n==1){
            System.out.println("Happy");
        }
        else{
            System.out.println("Not Happy");
        }
    }
}