import java.util.*;
public class character{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        char a = sc.next().charAt(0);
        if (a>='a') && (a<='z') || (a>='A') &&(a<='Z'){
            System.out.println("It is `Character  "+a);
        }
        else{
            System.out.println("It is not character");
       }
    }
}