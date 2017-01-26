package me.grapebaba;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class A219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0, length = nums.length; i < length; i++) {
            int val = nums[i];
            if (map.containsKey(val) && (Math.abs(i - map.get(val)) <= k)) {
                return true;
            } else {
                map.put(val, i);
            }
        }

        return false;
    }

    //Slide window set size=k+1,new into window is nums[i],
    public boolean containsNearbyDuplicate1(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0, length = nums.length; i < length; i++) {
            int val = nums[i];
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            if (!set.add(val)) {
                return true;
            }
        }

        return false;
    }
}
