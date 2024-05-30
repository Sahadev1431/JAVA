package Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1 ; row <= (n*2)-1; row++) {
            int colNo = row > n ? n -(row-n) : row;

            // int colNo = row;
            // if (colNo <=n) {
            //     for (int col = 1;col <= colNo;col++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // } else {
            //     colNo= n -(row-n);
            //     for (int col = 1;col<=colNo;col++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            for (int col = 1;col <= colNo;col++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}
