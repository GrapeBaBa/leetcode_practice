package me.grapebaba;

/**
 * Created by grapebaba on 7/4/17.
 */
public class A424 {
    public int characterReplacement(String s, int k) {
        int[] store = new int[26];
        int start = 0;
        int maxOcur = 0;
        int maxLen = 0;

        for (int end = 0; end < s.length(); end++) {
            int count = ++store[s.charAt(end) - 'A'];
            maxOcur = Math.max(maxOcur, count);
            if (end - start + 1 - maxOcur > k) {
                store[s.charAt(start) - 'A']--;
                start++;
            }
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
}
