public class PalindromeString {
    public static void main(String[] args) {
        String str = "Abcd  cba";
        if (palindrome(str))
        {
            System.out.println("the string is palindrome.");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }

    static boolean palindrome(String str)
    {
        str = str.toLowerCase();
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i<str.length();++i)
        {
            char ch = str.charAt(str.length()-i-1);
            // builder.append(ch);
            if(ch!= ' ')
            {
                builder.append(ch);
            }
        }

        return builder.toString().equals(str.replaceAll("\\s",""));
    }

}
