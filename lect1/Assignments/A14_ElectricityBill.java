public class A14_ElectricityBill {
    public static void main(String[] args) {
        
        float units = 150;
        float bill;

        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = units * 3;
        } else {
            bill = units * 5;
        }

        System.out.println("Total bill: Rs " + bill);
    }
}