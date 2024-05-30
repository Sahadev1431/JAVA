public class leetVowel{
    public static void main(String[] args) {
        // String s = "leetcode";
        // s.contains("a");

        // String res = "";
        // int end = s.length()-1;
        // for (int i = 0;i < s.length();i++)
        // {
        //     if(s.charAt(i) != 'a' && s.charAt(i) != 'e'&& s.charAt(i) != 'i' && s.charAt(i) != 'o'&& s.charAt(i) != 'u' &&  s.charAt(i) != 'A' && s.charAt(i) != 'E'&& s.charAt(i) != 'I' && s.charAt(i) != 'O'&& s.charAt(i) != 'U')
        //     {
        //         res = res+s.charAt(i);
        //     }
        //     else
        //     {
        //         while(s.charAt(end) != 'a' && s.charAt(end) != 'e' && s.charAt(end) != 'i' && s.charAt(end) != 'o' && s.charAt(end) != 'u'&& s.charAt(end) != 'A' && s.charAt(end) != 'E' && s.charAt(end) != 'I' && s.charAt(end) != 'O' && s.charAt(end) != 'U')
        //         {
        //             end--;
        //         }
        //         res = res + s.charAt(end);
        //         end--;
        //     }
        // }
        // System.out.println(res);

        String s = "leetcode";
        char[] arr = s.toCharArray();
        int start = 0;
        int end = s.length()-1;

        while( start < end )
        {
            while (start < end && !isVowel(arr[start]))
            {
                start++;
            }
            while (start < end && !isVowel(arr[end]))
            {
                end--;
            }
            if (start < end)
            {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end --;
            }
        }
        
        String res = new String(arr);
        System.out.println(res);

    }
    static boolean isVowel(char c)
    {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
        || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}