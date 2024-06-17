import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        boolean isPalindromeString = isPalindromeWithString(inputString);
        System.out.println("Using String approach: " + (isPalindromeString ? "Palindrome" : "Not a palindrome"));

        boolean isPalindromeStringBuffer = isPalindromeWithStringBuffer(inputString);
        System.out.println("Using StringBuffer approach: " + (isPalindromeStringBuffer ? "Palindrome" : "Not a palindrome"));

        scanner.close();
    }
    private static boolean isPalindromeWithString(String str) {
        String reversedString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }
        return str.equals(reversedString);
    }
    private static boolean isPalindromeWithStringBuffer(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        return str.equals(stringBuffer.reverse().toString());
    }
}
