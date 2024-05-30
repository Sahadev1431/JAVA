package Patterns;

public class Pattern8 {
    public static void main(String[] args) {
        int n = 4;
        for (int row = 1; row <=(n*2) - 1 ; row++) {

            int noOfCol = row > n ? (2*n) - row : row;
            int noOfSpace = n -noOfCol;

            for (int s = 1; s <= noOfSpace; s++) {
                System.out.print(" ");
            }
            for (int col = noOfCol; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= noOfCol; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
