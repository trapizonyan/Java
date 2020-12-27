package Pr8;


import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("file.txt", false)) {
            String text = "aaaaaaaaaaa";
            writer.write(text);
            writer.append('\n');
            writer.append('B');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (FileWriter writer = new FileWriter("file.txt", true)) {
            String text = "eeeeeeeeeeeeeeeeeeeeee";
            writer.write(text);
            writer.append('\n');
            writer.append('C');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (FileReader reader = new FileReader("file.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (FileWriter writer = new FileWriter("file.txt", false)) {
            String text = "new file ";
            writer.write(text);
            writer.append("ASD");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}