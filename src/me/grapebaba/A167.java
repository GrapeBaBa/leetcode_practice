package me.grapebaba;


public class A167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        if (numbers == null) {
            return result;
        }
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int val = numbers[left] + numbers[right];
            if (val == target) {
                result[0] = left + 1;
                result[1] = right + 1;
                return result;
            } else if (val < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}
