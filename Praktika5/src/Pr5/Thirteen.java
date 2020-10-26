package Pr5;
import java.util.ArrayList;
import java.util.Scanner;
public class Thirteen {
        public static int recursion(){
            ArrayList<Integer> array = new ArrayList<Integer>();
            int n = 20;
            Scanner in = new Scanner(System.in);
            for (int i = 0; i < n; i++){
                int x = in.nextInt();
                if (x != 0)
                    array.add(x);
                else
                    n = i + 1;
            }
            for (int i = 0; i < n; i++){
                if (i%2 == 0)
                    System.out.println(array.get(i));
            }
            return 1;
        }
        public static void main(String[] args) {
            recursion();
        }
    }

