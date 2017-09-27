package me.grapebaba;

/**
 * Created by grapebaba on 9/27/17.
 */
public class A5 {
    public String longestPalindrome(String s) {
        if (s == null) {
            return null;
        }
        int len = s.length();
        if (len == 0) {
            return "";
        }

        boolean[][] flags = new boolean[len][len];
        int start = 0;
        int end = 0;

        //初始规模1和2的数据
        for (int i = 0; i < len; i++) {
            flags[i][i] = true;
            if (i < len - 1) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    if (end - start + 1 == 1) {
                        start = i;
                        end = i + 1;
                    }
                    flags[i][i + 1] = true;
                }
            }
        }

        for (int n = 3; n <= len; n++) {
            for (int l = 0; l <= len - n; l++) {
                int r = l + n - 1;
                if (flags[l + 1][r - 1] && s.charAt(l) == s.charAt(r)) {
                    if (r - l > end - start) {
                        start = l;
                        end = r;
                    }
                    flags[l][r] = true;
                }
            }
        }

        return s.substring(start, end + 1);
    }

    public static void main(String[] args) throws Exception {
        A5 a5 = new A5();
        String res = a5.longestPalindrome(null);
        System.out.printf(res);
    }
}
