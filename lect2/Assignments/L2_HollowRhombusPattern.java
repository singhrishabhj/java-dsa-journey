public class L2_HollowRhombusPattern {

    public static void main(String args[]) {

        int n = 5;
        int row = 1;
        int space = n - 1;

        while (row <= n) {

            // Print spaces
            int i = 1;
            while (i <= space) {
                System.out.print(" ");
                i++;
            }

            // Print hollow stars
            int j = 1;
            while (j <= n) {

                if (row == 1 || row == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

                j++;
            }

            System.out.println();

            space--;
            row++;
        }
    }
}