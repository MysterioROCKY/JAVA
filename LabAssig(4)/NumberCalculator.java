import java.util.*;

public class NumberCalculator {

    private int numbers[];

    public NumberCalculator(int inputnumbers[]) {
        this.numbers = inputnumbers;
    }

    public double calculateAverage() {
        double sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return (sum / numbers.length);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Array: ");
        int size = sc.nextInt();
        System.out.println("Enter elements of array -> ");
        int umbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            umbers[i] = sc.nextInt();
        }

        NumberCalculator NumberCalculator = new NumberCalculator(umbers);
        double result = NumberCalculator.calculateAverage();
        System.out.println("Average of numbers is = " + result);

    }

}
