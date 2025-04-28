import java.util.*;
public class character{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        char a = sc.next().charAt(0);
        if (Character.isDigit(a)){
            System.out.println("It is digit `     "+a);
        }
        else{
            System.out.println("It is  character");
       }
    }
}