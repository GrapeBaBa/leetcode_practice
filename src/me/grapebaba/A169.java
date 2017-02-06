package me.grapebaba;

public class A169 {
    public int majorityElement(int[] nums) {
        int majority = 0;


        int mask = 1;

        for (int i = 0; i < 32; i++, mask <<= 1) {
            int bitCountForOne = 0;
            int bitCountForZero = 0;

            for (int j = 0, length = nums.length; j < length; j++) {
                if ((nums[j] & mask) != 0) {
                    bitCountForOne++;
                } else {
                    bitCountForZero++;
                }
                if (bitCountForOne > length / 2) {
                    majority |= mask;
                    break;
                }
                if (bitCountForZero > length / 2) {
                    break;
                }
            }
        }

        return majority;
    }
}
