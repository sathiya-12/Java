public class amstrong{
    public static void main(String[] args){
        int n=153;
        int a=0;
        int temp=n;
        while (n>0){
            int d=n%10;
            a=a+d*d*d;
            n =n/10;
        }
        if (temp==a){
            System.out.println("Amstrong");
        }
        else{
            System.out.println("Not Amstrong");
        }
    }
}