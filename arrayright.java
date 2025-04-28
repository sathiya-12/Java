import java.util.Arrays;

public class arrayright {
    public static void main (String[] args){
        int[] arr={0,1,0,3,22};
        int[] num1=new int[arr.length];
        int num2=0;
        for(int e: arr){
            if (e>=1){
                num1[num2++]=e;
            }
        }
        System.out.println(Arrays.toString(num1));
    }
}
