import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputOutput {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter text to be stored in a file: ");
            String userInput = reader.readLine();

            FileWriter writer = new FileWriter("output.txt");

            writer.write(userInput);

            writer.close();
            reader.close();

            System.out.println("Input has been written to 'output.txt'.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
