package me.grapebaba;


public class A189 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) throws Exception {
        A189 a189 = new A189();
        int[] test = new int[]{1, 2, 3, 4, 5, 6, 7};
        a189.rotate(test, 14);
        for (int num : test) {
            System.out.printf(String.valueOf(num));
        }
    }
}
