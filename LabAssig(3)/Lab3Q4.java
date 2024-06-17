public class Lab3Q4 {
    public static void main(String args[]) {
        int n = 2;
        int c = 0;

        if (n == 1) {
            System.out.println(n + " is not Prime");
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) { // Checking Remainder
                    c++;
                }
            }

            if (c > 0) {
                System.out.println(n + " is not Prime");
            } else {
                System.out.println(n + " is Prime");
            }
            return;
        }
    }
}
