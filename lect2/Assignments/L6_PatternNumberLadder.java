// 1
// 2 3
// 4 5 6
// 7 8 9 10


public class L6_PatternNumberLadder {
    public static void main(String[] args) {
        
        int n = 4;
        int row = 1;
        int star = 1;
        int count = 1;
        

        while (row <= n) {

            //number print /star print 
            int i = 1;
            while (i <= star) {
                System.out.print(count + " ");
                i ++;
                count ++;
            }

            //next line prep 
            System.out.println();
            star ++ ;
            row ++ ;
        }
    }
}
