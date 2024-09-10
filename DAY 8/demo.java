import java.util.Scanner;
class tree{
    void display(){
        System.out.println("java");
    }
}
public class demo {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        tree obj =new tree();
        System.out.println("ENTER NAME:");
        String n=s.nextLine();
        System.out.println("name: "+n);
        obj.display();
    }
    
}
