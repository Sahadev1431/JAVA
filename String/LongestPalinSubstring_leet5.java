public class LongestPalinSubstring_leet5 {
    public String longestPalindrome(String s) {
        // String ans = "";
        // for (int i = 0; i < s.length(); i++) {
        //     for (int j = i ; j < s.length(); j++) {
        //         if (s.charAt(i) == s.charAt(j)) {
        //             int start = i,aStart = i,flag = 0;
        //             int end = j,aEnd = j;
        //             String temp = "";
        //             while (start <= end) {
        //                 if (s.charAt(start) == s.charAt(end)) {
        //                     start++;
        //                     end--;
        //                 } else {
        //                     flag = 1;
        //                     break;
        //                 }
        //             }
        //             if (flag == 0) {
        //                 temp = s.substring(aStart, aEnd + 1);
        //             }
        //             if (temp.length() > ans.length()) {
        //                 ans = temp;
        //             }
        //         }
        //     }
        // }
        // return ans;
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || i == s.length() - 1) {
                if (ans.length() < 1) ans = s.substring(i, i+1);
            } else {
                boolean flag = true;
                int start = i,end = i;
                while (start < 0 && end > s.length()-1) {
                    if (s.charAt(start) == s.charAt(end)) {
                        start --;
                        end ++;
                    } else {
                        if ((s.substring(start + 1, end)).length() > ans.length()) {
                            ans = s.substring(start + 1, end);
                        }
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    if (start == -1) {
                        ans = s.substring(0, end);
                    } else {
                        ans = s.substring(start, end);
                    }
                }
            }
        }
        return ans;
    }
}
