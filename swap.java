public class swap {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        int c=7;
        int temp;
        temp=a;
        a=c;
        c=b;
        b=temp;
        System.out.println("A : "+a);
        System.out.println("B : "+b);
        System.out.println("C : "+c);
    }
}
