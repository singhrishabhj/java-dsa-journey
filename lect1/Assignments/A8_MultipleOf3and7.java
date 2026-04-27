public class A8_MultipleOf3and7 {

    public static void main(String[] args) {
        
        int num = 21 ;

        if ( (num % 3 == 0) && (num % 7 == 0)){
        System.out.println("The number " + num + " is a multiple of 3 and 7 .");
        }else{
            System.out.println("The number " + num + " is not a multiple of 3 and 7 .");
        }
    }
    
}