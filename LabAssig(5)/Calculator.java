public class Calculator {
    int a, b;
    float c;
    int int_res;
    double dou_result;

    // Constructors...
    public Calculator() {
        a = b = 0;
        c = 0.0f;
    }

    public Calculator(int m, int n) {
        this.a = m;
        this.b = n;
    }

    public Calculator(double m) {
        this.c = 0.0f;
    }
    
    // Methods...
    public int add(int m, int n) {
        return int_res = a + b;
    }

    public double add(double m, double n) {
        return dou_result = m + n;
    }

    public int sub(int m, int n) {
        return int_res = m - n;
    }

    public double sub(double m, double n) {
        return dou_result = m - n;
    }

    public void displayresult(String m, int n) {
        System.out.println(m + ": " + int_res);
    }

    public void displayresult(String m, double n) {
        System.out.println(m + ": " + dou_result);
    }

    public static void main(String[] args) {
        // First constructor
        System.out.println("First Constructor:->");
        Calculator obj1 = new Calculator();
        obj1.add(2, 3);
        obj1.displayresult("Result add(int)", 5);
        obj1.add(6.5, 9.7);
        obj1.displayresult("Result add(double)", 2.1);
        obj1.sub(44,11);
        obj1.displayresult("Result Subtraction(int)", 0);
        obj1.sub(92.5, 5.7);
        obj1.displayresult("Result Subtraction(double)", .5);
        System.out.println();

        // Second constructor
        Calculator obj2 = new Calculator(7, 20);
        System.out.println("Second Constructor:->");
        obj2.add(12, 122);
        obj2.displayresult("Result add(int)", 5);
        obj2.add(7.5, 45.7);
        obj2.displayresult("Result add(double)", 2.1);
        obj2.sub(61, 2);
        obj2.displayresult("Result Subtraction(int)", 0);
        obj2.sub(27.5, 5.7);
        obj2.displayresult("Result Subtraction(double)", .5);
        System.out.println();

        // Third constructor
        Calculator obj3 = new Calculator(78.9);
        System.out.println("Third Constructor:->");
        obj3.add(59, 1);
        obj3.displayresult("Result add(int)", 5);
        obj3.add(9.1, 23.6);
        obj3.displayresult("Result add(double)", 2.1);
        obj3.sub(200, 103);
        obj3.displayresult("Result Subtraction(int)", 0);
        obj3.sub(23.5, 3.7);
        obj3.displayresult("Result Subtraction(double)", .5);
    }
}