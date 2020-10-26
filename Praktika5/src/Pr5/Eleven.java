package Pr5;
import java.util.Scanner;
public class Eleven {
    public static int recursion(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a==1)
                return recursion()+1;

        if(a==0){
            int b = in.nextInt();
                if(b == 0)
                    return 0;
                else
                if(b == 1)
                    return recursion()+1;
                else
                    return recursion();
            }
        else
            return recursion();
        }
    public static void main(String[] args) {
        System.out.println(recursion());
    }
}