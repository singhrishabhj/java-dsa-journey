public class L1_SquareBox {
    public static void main(String[] args) {
        
        int n = 5; 
        int row = 1;
        int str = n;

        while (row <= n){
            //stars
            int i = 1;
            while(i <= str){
                System.out.println("* ");
                i++;
            }
            //next line prep
            row ++;
        }
    }
}
