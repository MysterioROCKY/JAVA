import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        String concatenatedString = str1.concat(str2);
        System.out.println("Concatenated String: " + concatenatedString);

        System.out.print("Enter the starting index for substring: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the ending index for substring: ");
        int endIndex = scanner.nextInt();

        if (startIndex >= 0 && endIndex <= concatenatedString.length() && startIndex <= endIndex) {
            String substring = concatenatedString.substring(startIndex, endIndex + 1);
            System.out.println("Substring: " + substring);
        } else {
            System.out.println("Invalid indices. Please make sure the indices are within bounds.");
        }
        scanner.close();
    }
}
