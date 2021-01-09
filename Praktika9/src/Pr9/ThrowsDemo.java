package Pr9;
import java.util.Scanner;

public class ThrowsDemo {
    public void printMessage1(String key) {
        try {
            String message = getDetails1(key); System.out.println( message );
        } catch (NullPointerException e) {
            System.out.println("meow");
        }
    }
    public String getDetails1(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for " + key;
    }

    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter Key ");
        String key = myScanner.nextLine();
        try {
            printDetails(key);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            getKey();
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.printMessage1(null);
        demo.printMessage1("gav");
        System.out.println("____________________________");
        demo.getKey();
    }
}