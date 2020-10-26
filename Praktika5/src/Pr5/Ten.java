package Pr5;

public class Ten {
    public static int recursion(int n, int a){
        if(n==0)
            return a;
        else
            return recursion(n/10, 10*a+n%10);
    }
    public static void main(String[] args) {
        System.out.println(recursion(987654321, 0));
    }
}
