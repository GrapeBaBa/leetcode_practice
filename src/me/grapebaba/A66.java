package me.grapebaba;

public class A66 {
    public int[] plusOne(int[] digits) {
        for (int length = digits.length, i = length - 1; i >=0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args)throws Exception{
        int[] test=new int[]{9};
        A66 a66=new A66();
        a66.plusOne(test);
    }
}
