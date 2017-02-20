package me.grapebaba;


public class A27 {
    public int removeElement(int[] nums, int val) {
        int result = 0;
        for (int i = 0, length = nums.length; i < length; i++) {
            if (nums[i] != val) {
                nums[result++] = nums[i];
            }
        }
        return result;
    }

}
