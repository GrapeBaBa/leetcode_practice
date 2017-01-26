package me.grapebaba;


public class A283 {
    //记录插入位置，插入非零元素，补零
    public void moveZeroes(int[] nums) {
        int insertPosition = 0;

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (val != 0) {
                if (i > insertPosition) {
                    nums[insertPosition] = nums[i];
                }
                insertPosition++;
            }
        }

        for (int i = insertPosition; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    //交换下一个零和非零元素
    public void moveZeroes1(int[] nums) {
        int nextZero = 0;

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (val != 0) {
                int temp = nums[i];
                nums[i] = nums[nextZero];
                nums[nextZero] = temp;
                nextZero++;
            }
        }
    }

}
