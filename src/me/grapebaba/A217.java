package me.grapebaba;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by grapebaba on 1/26/17.
 */
public class A217 {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            boolean val = set.add(num);
            if (!val) {
                return true;
            }
        }

        return false;
    }
}
