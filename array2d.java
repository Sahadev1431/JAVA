import java.util.Scanner;
// import java.util.Arrays;
public class array2d {
    public static void main(String[] args) {
        int [][]arr = new int [3][3];
        System.out.println(arr.length);

        for(int row = 0;row<arr.length;++row)
        {
            for(int col = 0 ; col < arr[row].length;++col)
            {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter number:");
                arr[row][col] = in.nextInt();
                in.close();
            }
        }

        for(int row = 0 ; row < arr.length ; ++ row)
        {
            for( int col = 0;col<arr[row].length; ++col)
            {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        // for( int row = 0 ;row <arr.length ; ++row)
        // {
        //     System.out.println(Arrays.toString(arr[row]));
        // }
        

        // for(int [] a : arr)
        // {
        //     System.out.println(Arrays.toString(a));
        // }
        
    }
}
