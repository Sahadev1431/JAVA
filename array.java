import java.util.Scanner;
// import java.util.Arrays;
public class array {
    public static void main(String[]args)
    {
        int n;
        System.out.print("how many number's array do want to create :");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.nextLine();

        // int arr[] = new int[n];

        // for(int i = 0;i<arr.length;++i)
        // {
        //     System.out.print("Enter number "+(i+1)+" :");
        //     arr[i] = in.nextInt();
        // }
        // for(int i = 0;i<arr.length;++i)
        // {
        //     System.out.println("Number "+(i+1)+" is "+ arr[i]);
        // }
        // for(int i :arr)
        // {
        //     System.out.println(i);
        // }


        // System.out.println(Arrays.toString(arr));

        String[] arr = new String[n];
        for(int i = 0; i < arr.length; ++i)
        {
            System.out.println("Enter number "+(i+1)+" :");
            arr[i] = in.nextLine();
            // in.nextLine();
        }
        for(String i :arr)
        {
            System.out.println(i);
        }
        in.close(); 
    }
}
