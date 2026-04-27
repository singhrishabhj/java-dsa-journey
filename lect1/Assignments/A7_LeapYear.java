public class A7_LeapYear {

    public static void main(String[] args) {
        
        int year = 4000;

        if( (year % 4 == 0 && year % 100 != 0) && (year % 400 == 0)){
            System.out.println("The year " + year + " is a leap year.");
        }else {
            System.out.println("The year " + year + " is not a leap year.");
        }
    }
}