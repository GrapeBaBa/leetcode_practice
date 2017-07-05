package me.grapebaba;

/**
 * Created by grapebaba on 7/4/17.
 */
public class A38 {
    public String countAndSay(int n) {
        String s = "1";

        for (int i = 1; i < n; i++) {
            int count = 1;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s.length() - 1; j++) {
                if (s.charAt(j) == s.charAt(j + 1)) {
                    count++;
                } else {
                    sb.append(count).append(s.charAt(j));
                    count = 1;
                }
            }
            sb.append(count).append(s.charAt(s.length() - 1));
            s = sb.toString();
        }

        return s;
    }

    public static void main(String[] args) throws Exception {
        A38 a38 = new A38();
        System.out.printf(a38.countAndSay(10));
    }
}
