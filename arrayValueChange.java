public class arrayValueChange {
    public static void main(String[] args) {
        int[] arr= new int[5];
        arr[0] = 45;
        arr[1] = 45;
        arr[2] = 45;
        arr[3] = 45;
        arr[4] = 45;
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
        change(arr);
        System.out.println();
        for(int i : arr)
        {   
            System.out.print(i + " ");
        }
    }

    static void change(int[] ar )
    {
        ar[1] = 55;
    }
}
