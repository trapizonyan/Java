package Pr9;
import java.util.Scanner;
public class Exceptions {
    public void exceptionDemo1() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
    public void exceptionDemo2() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.nextLine();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.err.println("Enter an integer!");
        } finally {
            System.out.println("asd");
        }
    }
    public static void main(String[] args) {
        Exceptions exc = new Exceptions();
        exc.exceptionDemo1();
        System.out.println("_____________________________");
        exc.exceptionDemo2();
    }

}
