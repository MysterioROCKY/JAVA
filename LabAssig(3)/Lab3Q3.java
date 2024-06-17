public class Lab3Q3 {
    public static void main(String[] args) {
        int year = 2001;

        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " is a Leap Year");
        }
        else{
            System.out.println(year + " is not a Leap Year");
        }
    }
}
