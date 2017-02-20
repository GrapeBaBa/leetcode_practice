package me.grapebaba;


public class A26 {
    public int removeDuplicates(int[] nums) {
        int length = 1;
        for (int i = 1, len = nums.length; i < len; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[length++] = nums[i];
            }
        }
        return length;
    }
}
