package me.grapebaba;


import java.util.ArrayList;
import java.util.List;

public class A448 {
    // 绝对值正数数组
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int val = Math.abs(nums[i]);
            nums[val - 1] = -Math.abs(nums[val - 1]);
        }

        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            int val = nums[i];
            if (val > 0) {
                results.add(i + 1);
            }
        }

        return results;
    }

}
