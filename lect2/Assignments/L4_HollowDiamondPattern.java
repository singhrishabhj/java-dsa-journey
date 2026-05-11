//  *****
//  ** **
//  *   *
//  ** **
//  *****

public class L4_HollowDiamondPattern {

    public static void main(String[] args) {

        int n = 5;

        int star = n / 2 + 1;
        int space = -1;
        int row = 1;

        while (row <= n) {

            // Left stars
            int i = 1;
            while (i <= star) {
                System.out.print("*");
                i++;
            }

            // Middle spaces
            int j = 1;
            while (j <= space) {
                System.out.print(" ");
                j++;
            }

            // Right stars
            int k = 1;

            if (row == 1 || row == n) {
                k = 2;
            }

            while (k <= star) {
                System.out.print("*");
                k++;
            }

            // Mirror logic
            if (row < n / 2 + 1) {
                star--;
                space += 2;
            } else {
                star++;
                space -= 2;
            }

            // Next line
            System.out.println();
            row++;
        }
    }
}