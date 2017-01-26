package me.grapebaba;

public class A485 {
    //sum重置0
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int sum = 0;

        for (int value : nums) {
            if (value == 1) {
                sum = sum + 1;
                if (sum > max) {
                    max = sum;
                }
            } else {
                sum = 0;
            }
        }

        return max;
    }

}
