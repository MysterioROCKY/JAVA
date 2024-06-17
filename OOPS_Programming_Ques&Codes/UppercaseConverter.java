import java.util.Scanner;

public class UppercaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of characters you want to convert to uppercase: ");
        int numCharacters = scanner.nextInt();

        scanner.nextLine(); 

        System.out.print("Enter the characters: ");
        String input = scanner.nextLine();

        if (input.length() < numCharacters) {
            System.out.println("Input is shorter than the specified number of characters.");
        } else {
            String converted = input.substring(0, numCharacters).toUpperCase();
            System.out.println("Uppercase result: " + converted);
        }

        scanner.close();
    }
}
