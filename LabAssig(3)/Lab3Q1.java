public class Lab3Q1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        a = a * b;
        b = a / b;
        a = a / b;
        
        System.out.println("Value of 'a' and 'b' after swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
