package me.grapebaba;

/**
 * Created by grapebaba on 7/17/17.
 */
public class A303 {
    // 子问题sum[i,j],i左边界，j右边界
    // sum[i,j]
    static public class NumArray {
        private int[][] cache;

        public NumArray(int[] nums) {
            cache = new int[nums.length][nums.length];
            //子问题规模从1到n
            for (int n = 1; n <= nums.length; n++) {
                //左边界取值从0到总长-规模
                for (int i = 0; i <= nums.length - n; i++) {
                    //右边界取值等于左边界+规模-1
                    int j = i + n - 1;
                    if (n == 1) {
                        cache[i][j] = nums[i];
                    } else {
                        cache[i][j] = cache[i][j - 1] + nums[j];
                    }
                }
            }
        }

        public int sumRange(int i, int j) {
            return cache[i][j];
        }
    }

    // 子问题sum[i],前i个的和
    static public class NumArray1 {
        private int[] cache;

        public NumArray1(int[] nums) {
            cache = new int[nums.length];
            //每个规模的子问题只有一个
            for (int n = 0; n < nums.length; n++) {
                if (n == 0) {
                    cache[n] = nums[0];
                } else {
                    cache[n] = cache[n - 1] + nums[n];
                }
            }
        }

        public int sumRange1(int i, int j) {
            if (i == 0) {
                return cache[j];
            } else {
                return cache[j] - cache[i - 1];
            }
        }
    }

    public static void main(String[] args) throws Exception {
        NumArray1 numArray = new NumArray1(new int[]{2, 3, 4, 6, 8, 10});
        System.out.printf(String.valueOf(numArray.sumRange1(1, 3)));
    }

}
