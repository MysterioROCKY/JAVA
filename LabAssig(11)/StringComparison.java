public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "World";

        System.out.println("Are str1 and str2 equal? " + compareStrings(str1, str2));
        System.out.println("Are str1 and str3 equal? " + compareStrings(str1, str3));
    }
    private static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
