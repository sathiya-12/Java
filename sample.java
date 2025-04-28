import java.util.Scanner;
class sample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();
        String a=((age>=18))?"Eligible":"Not Eligible";
        String b=((a.equals("Eligile")))?"Check the nation":"Not Eligible";
        System.out.println(a);
        System.out.println(b);
        sc.nextLine();
        String nation=sc.nextLine();
        String c=((nation.equalsIgnoreCase("India")))?"Eligible":"Not Eligible";
        System.out.println(c);
    }
}