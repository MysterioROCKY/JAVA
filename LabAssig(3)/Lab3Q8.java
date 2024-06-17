public class Lab3Q8 {
    public static void main(String[] args) {
        double principal = 12600, rate = 10, time = 2;
        double CI = principal * (Math.pow((1 + rate / 100), time));

        System.out.println("Compound Interest is " + CI);

    }
}
