import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime=true;
        if ((n==0) || (n==1)){
            System.out.println("Not Prime number");
    }
        else if(n==2){
            System.out.println("Prime number");
    }
        else{
            for(int i=2;n<=Math.sqrt(n);i++){
                if (n%i==0){
                    isPrime= false;
                    break;
            }
        }
        if (isPrime){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not prime number");
        }
    }
}

    }
    