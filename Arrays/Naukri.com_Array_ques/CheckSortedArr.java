public class CheckSortedArr {

    public static int isSorted(int n, int []a) {
        for (int i = 1; i < a.length; i++) {
            if(a[i] < a[i-1]) return 0;
        }
        return 1;
    }
}