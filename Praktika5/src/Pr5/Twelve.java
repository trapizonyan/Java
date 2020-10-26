package Pr5;
import java.util.Scanner;
import java.util.ArrayList;
public class Twelve {

    public static void recursion() {
        Scanner in = new Scanner(System.in);
        int n, zero = 0, count = 0;
        ArrayList<Integer> array = new ArrayList<Integer>();
        while (zero != 1) {
            n = in.nextInt();
            if (n % 2 == 1) {
                array.add(n);
                count++;
            }
            if (n == 0)
                zero++;
        }
        for (int i = 0; i < count; i++)
            System.out.println(array.get(i));
    }
        public static void main (String[]args){
            recursion();
        }
    }

