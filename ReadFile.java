import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        String path = "text.txt";
        try (Scanner read = new Scanner(System.in);
             BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            String line = "";
            do {
                System.out.print("Input text or exit: ");
                line = read.nextLine();
                if (!line.toLowerCase().equals("exit")) {
                    writer.write(line);
                    writer.newLine();
                    writer.flush();
                }
            } while (!line.toLowerCase().equals("exit"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}