public class Lab2Q1 {
    public static void main(String[] args) {
        
        // Washing Machine speification

        int price = 10000;               // price of machine is 10000Rs (32 bits)
        long processorNo = 345645669;   // processor number of machine (64 bits)
        double spin = 400.50d;         // maximum spin speed by which machine can run is 400rpm (64 bits)
        float energyCons = 0.67f;     // maximum energy consumption used by machine is 0.67KWh (32 bits)
        short waterCapa = 9000;      // maximum water capacity machine can hold  is 9000Litre (-32768 to 32767)
        char type = 'A';            // 'A' speifies Automatic machine
        byte weight = 60;          // Total weight of machine is 60Kg (-128 to 127)
        boolean isWorking = false;// Specifies if machine is working or not (T/F)

        System.out.println("Specifications of Washing Machine :-> ");

        System.out.println("1) Price of WM = " + price);
        System.out.println("2) Processor ID of WM = " + processorNo);
        System.out.println("3) Max Spin speed of WM = " + spin);
        System.out.println("4) Max energy consumption of WM = " + energyCons);
        System.out.println("5) Max water consumption of WM = " + waterCapa);
        System.out.println("6) Type of WM 'A for automatic' = " + type);
        System.out.println("7) Total weight of WM = " + weight);
        System.out.println("8) Is WM working? = " + isWorking);

    }
}
