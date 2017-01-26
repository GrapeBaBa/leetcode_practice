package me.grapebaba;

public class A268 {
    //必须是连续数序列，可以无序
    public int missingNumber(int[] nums) {
        int xor = 0, i = 0;
        for (int length = nums.length; i < length; i++) {
            xor = xor ^ i ^ nums[i];
        }

        return xor ^ i;
    }
}
