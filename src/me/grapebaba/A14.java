package me.grapebaba;

/**
 * Created by grapebaba on 9/29/17.
 */
public class A14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (i == strs[j].length() || (strs[j].charAt(i) != c)) {
                    return strs[0].substring(0, i);
                }
            }
        }

      return strs[0];
    }
}
