public class RotateImage_leet48 {
    public static void main(String[] args) {

        //try

        int[][]matrix  = new int[4][4];
        int count = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = count;
                count++;
            }
        }
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix.length; j++) {
        //         // matrix[i][j] = count;
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        //transpose

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int swap = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = swap;
            }
        }

    //    swap all the rows

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length / 2; j++) {
                int swap = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length - j -1];
                matrix[i][matrix[i].length - j -1] = swap;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                // matrix[i][j] = count;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
