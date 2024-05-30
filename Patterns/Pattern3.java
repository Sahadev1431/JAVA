package Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        // for (int row = 0; row < n; row++ ) {
        //     for (int col=0; col <= n-row-1;col++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        for (int row = 1; row <=n ;row++ ) {
            for (int col=1;col <= n -row +1;col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
