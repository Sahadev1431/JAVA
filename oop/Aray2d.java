

public class Aray2d {
    public static void main(String[] args) {

        // int row1, col1, row2, col2;
        // Scanner s = new Scanner(System.in);

        // // Input dimensions of First Matrix: A
        // System.out.print("Enter number of rows in first matrix: ");
        // row1 = s.nextInt();

        // System.out.print("Enter number of columns in first matrix: ");
        // col1 = s.nextInt();

        // // Input dimensions of second matrix: B
        // System.out.print("Enter number of rows in second matrix: ");
        // row2 = s.nextInt();

        // System.out.print("Enter number of columns in second matrix: ");
        // col2 = s.nextInt();

        // // Requirement check for matrix multiplication
        // if (col1 != row2) {
        //     System.out.println("Matrix multiplication is not possible");
        //     return;
        // }

        // int a[][] = new int[row1][col1];
        // int b[][] = new int[row2][col2];
        // int c[][] = new int[row1][col2];

        // // Input the values of matrices
        // System.out.println("\nEnter values for matrix A : ");
        // for (int i = 0; i < row1; i++) {
        //     for (int j = 0; j < col1; j++)
        //         a[i][j] = s.nextInt();
        // }
        // System.out.println("\nEnter values for matrix B : ");
        // for (int i = 0; i < row2; i++) {
        //     for (int j = 0; j < col2; j++)
        //         b[i][j] = s.nextInt();
        // }

        // // Perform matrix multiplication
        // // Using for loop
        // System.out.println("\nMatrix multiplication is : ");
        // for (int i = 0; i < row1; i++) 
        // {
        //     for (int j = 0; j < col2; j++) 
        //     {
        //         // Initialize the element C(i,j) with zero
        //         c[i][j] = 0;

        //         // Dot product calculation
        //         for (int k = 0; k < col1; k++)
        //         {
        //             c[i][j] += a[i][k] * b[k][j];
        //         }

        //         // System.out.print(c[i][j] + " ");
        //     }
        //     System.out.println();

        // }

        // for(int i = 0 ;i < 3;i++)
        // {
        //     for(int j = 0;j<2;j++)
        //     {
        //         System.out.print(c[i][j]+" ");
        //     }
        // }




        int [][] a = {
        {1,3,5,7},
        {2,4,6,8},
        {1,8,6,2}
        };

        int[][] b = {
        {2,4},
        {1,5},
        {4,3},
        {2,6}
        };

        int[][]res = new int [a.length][b[0].length];

        for ( int i = 0; i < a.length ; i++ )
        {
            for ( int j = 0 ;j < b[0].length; j++ )
            {
                for (int k = 0; k < a[0].length; k++)
                {
                    res[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
}
