public class A10_LargestOfthreeNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 80;
        int c = 90;

        if(a >= b && a >= c){
            System.out.println("A is greatest");
        } else if ( b>=c && b >= a) {
            System.out.println("B is greatest");
        } else {
            System.out.println("C is greatest");
        }

    }
    
}
