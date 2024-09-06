public class Pattern6 {
    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n*2;row++) {
            int noOfCol = row > n ? (2 * n) - row  : row;
            int noOfSpace = n-noOfCol;
            
            for (int s = 1 ;s <= noOfSpace ; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= noOfCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }   
}
