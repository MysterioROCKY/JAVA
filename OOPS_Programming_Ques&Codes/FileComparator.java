import java.io.*;

public class FileComparator {

    public static void main(String[] args) throws IOException {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        BufferedInputStream bufferedInputStream1 = new BufferedInputStream(new FileInputStream(file1));
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file2));

        int byte2 = 0;

        int byte1;
        while ((byte1 = bufferedInputStream1.read()) != -1 && (byte2 = bufferedInputStream2.read()) != -1) {
            if (byte1 != byte2) {
                break;
            }
        }

        bufferedInputStream1.close();
        bufferedInputStream2.close();

        if (file1.length() != file2.length()) {
            System.out.println("The files are not lexicographically equal.");
            return;
        }

        if (byte1 < byte2) {
            System.out.println("File 1 is lexicographically smaller than File 2.");
        } else if (byte1 > byte2) {
            System.out.println("File 1 is lexicographically greater than File 2.");
        } else {
            System.out.println("The files are lexicographically equal.");
        }
    }
}