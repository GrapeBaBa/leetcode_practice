package me.grapebaba;

public class A136 {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor = xor ^ num;
        }

        return xor;
    }
}
