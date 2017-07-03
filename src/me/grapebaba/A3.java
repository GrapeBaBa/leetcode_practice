package me.grapebaba;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by grapebaba on 7/3/17.
 */
public class A3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int slow = 0;
        int max = 0;
        for (int fast = 0; fast < s.length(); fast++) {
            char c = s.charAt(fast);
            if (map.containsKey(c)) {
                slow = Math.max(slow, map.get(c) + 1);
            }
            map.put(c, fast);
            max = Math.max(max, fast - slow + 1);
        }

        return max;
    }
}
