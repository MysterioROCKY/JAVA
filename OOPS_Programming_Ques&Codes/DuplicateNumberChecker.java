import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}

public class DuplicateNumberChecker {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a list of integers (separated by spaces): ");
        String input = scanner.nextLine();
        String[] inputNumbers = input.split(" ");

        try {
            for (String numStr : inputNumbers) {
                int num = Integer.parseInt(numStr);
                if (numbers.contains(num)) {
                    throw new DuplicateNumberException("Duplicate number found: " + num);
                }
                numbers.add(num);
            }
            System.out.println("No duplicate numbers found.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } catch (DuplicateNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
