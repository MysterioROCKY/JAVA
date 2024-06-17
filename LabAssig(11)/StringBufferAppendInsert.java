import java.util.Scanner;

public class StringBufferAppendInsert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuffer stringBuffer1 = new StringBuffer("Hello");
        StringBuffer stringBuffer2 = new StringBuffer("World");

        stringBuffer1.append(stringBuffer2);

        System.out.println("Appended StringBuffer: " + stringBuffer1);

        System.out.print("Enter the index at which to insert the new substring: ");
        int insertIndex = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter the new substring to insert: ");
        String newSubstring = scanner.nextLine();

        stringBuffer1.insert(insertIndex, newSubstring);

        System.out.println("Final StringBuffer: " + stringBuffer1);

        scanner.close();
    }
}
