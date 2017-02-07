package me.grapebaba;


public class A53 {
    // 动态规划加上分治
    /*
    max(i) 从0到i规模时的最大值
       max(i)=(max(i-1), sum(i-1)+val(i),val(i))
       sum(i)= if sum(i-1)<0 then val(i)
               else sum(i-1)+val(i)
     */
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int previousSum = nums[0];
        for (int i = 1, length = nums.length; i < length; i++) {
            int currentSum = previousSum + nums[i];
            maxSum = Math.max(maxSum, currentSum);
            maxSum = Math.max(maxSum, nums[i]);
            if (previousSum >= 0) {
                previousSum = currentSum;
            } else {
                previousSum = nums[i];
            }
        }

        return maxSum;
    }

    public static void main(String[] args) throws Exception {
        A53 a53 = new A53();
        int[] test = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        a53.maxSubArray(test);
    }
}
